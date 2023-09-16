// SPDX-License-Identifier: MIT

pragma solidity 0.8.21;
import "@openzeppelin/contracts/access/Ownable.sol";
import "@openzeppelin/contracts/token/ERC20/IERC20.sol";
import "@openzeppelin/contracts/token/ERC20/utils/SafeERC20.sol";

contract StakingPool is Ownable {
    using Cast for uint256;
    using SafeERC20 for IERC20;

    uint256 constant DAY_SECONDS = 86400;

    //质押token地址
    IERC20 stakeToken;
    //质押奖励token地址
    IERC20 rewardToken;

    uint256 public totalStaked; // Total amount staked
    mapping(address => uint256) public userStake; // Amount staked per user

    uint256 public totalWeightStaked; // Total amount staked
    mapping(address => uint256) public userWeightStake; // Amount staked per user

    //每个user质押的数量
    mapping(address => uint256) stakingNum;
    //某地址的质押代币detail
    mapping(address => mapping(uint256 => LockedBalance)) private shares;

    //每个用户质押代币的权重--根据代币数量和质押时间
    mapping(address => UserRewards) public accumulatedRewards; // Rewards accumulated per user
    RewardsPerToken public rewardsPerToken; // Accumulator to track rewards per token
    uint256 public rewardsRate; // Wei rewarded per second among all token holders
    uint256 public rewardsStart; // Start of the rewards program
    uint256 public rewardsEnd; // End of the rewards program

    event UserRewardsUpdated(address user, uint256 rewards, uint256 checkpoint);
    event RewardsPerTokenUpdated(uint256 accumulated);

    struct LockedBalance {
        uint256 amount;
        uint256 unlockTime;
        uint32 lockDays;
    }

    struct LockedBalanceRes {
        uint256 index;
        LockedBalance lockedBalance;
    }
    struct UserRewards {
        uint128 accumulated; // Accumulated rewards for the user until the checkpoint
        uint128 checkpoint; // RewardsPerToken the last time the user rewards were updated
    }
    struct RewardsPerToken {
        uint128 accumulated; // Accumulated rewards per token for the interval, scaled up by 1e18
        uint128 lastUpdated; // Last time the rewards per token accumulator was updated
    }

    //构造函数
    constructor(address _stakeTokenAddr, address _rewardTokenAddr) {
        stakeToken = IERC20(_stakeTokenAddr);
        rewardToken = IERC20(_rewardTokenAddr);
    }

    //质押代币
    function stake(uint256 _amount, uint32 _lockDays) external {
        require(_amount > 0, "stake amount must be large 0");
        require(_lockDays > 0, "_lockDays amount must be large 0");

        stakeToken.safeTransferFrom(msg.sender, address(this), _amount);

        _updateUserRewards(msg.sender);
        updateStakeInfo(msg.sender,_amount,_lockDays,true,0);
    }

    //解除质押代币
    function unStake(uint256 _amount, uint256 _index) external {
        require(_amount > 0, "unstake amount must be large 0");
        require(_index >= 0, "_index must be large  or equals 0");
        require(
            shares[msg.sender][_index].amount > _amount,
            "stake balance less _amount"
        );
        require(
            shares[msg.sender][_index].unlockTime <= block.timestamp,
            "unlock time has not arrived yet"
        );

    }

    //增加质押代币的数量

    //提取奖励
    function withdraw(uint256 _amount, uint256 index) external {}

    //获取可提取的奖励
    function withdrawBalance() external returns (uint256) {
        return 0;
    }

    //获取已提现奖励,【外部调用/所有人/不需要支付】
    function withdrewAlready() external returns (uint256) {
        return 0;
    }

    //获取总共的质押奖励
    function allReword() external view returns (uint256) {
        return 0;
    }

    //获取用户的质押份额list
    function getShare() external view returns (LockedBalanceRes[] memory) {
        LockedBalanceRes[] memory list;
        return list;
    }

    //获取总质押份额
    function getAllShare() external view returns (uint256) {
        return 0;
    }

    /// @notice Calculate and store current rewards for an user. Checkpoint the rewardsPerToken value with the user.
    function _updateUserRewards(address user)
        internal
        returns (UserRewards memory)
    {
        RewardsPerToken memory rewardsPerToken_ = _updateRewardsPerToken();
        UserRewards memory userRewards_ = accumulatedRewards[user];

        // We skip the storage changes if already updated in the same block
        if (userRewards_.checkpoint == rewardsPerToken_.lastUpdated)
            return userRewards_;

        // Calculate and update the new value user reserves.
        userRewards_.accumulated += _calculateUserRewards(
            userWeightStake[user],
            userRewards_.checkpoint,
            rewardsPerToken_.accumulated
        ).u128();
        userRewards_.checkpoint = rewardsPerToken_.accumulated;

        accumulatedRewards[user] = userRewards_;
        emit UserRewardsUpdated(
            user,
            userRewards_.accumulated,
            userRewards_.checkpoint
        );

        return userRewards_;
    }

    /// @notice Update and return the rewards per token accumulator according to the rate, the time elapsed since the last update, and the current total staked amount.
    function _updateRewardsPerToken()
        internal
        returns (RewardsPerToken memory)
    {
        RewardsPerToken memory rewardsPerTokenIn = rewardsPerToken;
        RewardsPerToken memory rewardsPerTokenOut = _calculateRewardsPerToken(
            rewardsPerTokenIn
        );

        // We skip the storage changes if already updated in the same block, or if the program has ended and was updated at the end
        if (rewardsPerTokenIn.lastUpdated == rewardsPerTokenOut.lastUpdated)
            return rewardsPerTokenOut;

        rewardsPerToken = rewardsPerTokenOut;
        emit RewardsPerTokenUpdated(rewardsPerTokenOut.accumulated);

        return rewardsPerTokenOut;
    }

    /// @notice Calculate the rewards accumulated by a stake between two checkpoints.
    function _calculateUserRewards(
        uint256 stakeweight_,
        uint256 earlierCheckpoint,
        uint256 latterCheckpoint
    ) internal pure returns (uint256) {
        return (stakeweight_ * (latterCheckpoint - earlierCheckpoint)) / 1e18; // We must scale down the rewards by the precision factor
    }

    /// @notice Update the rewards per token accumulator according to the rate, the time elapsed since the last update, and the current total staked amount.
    function _calculateRewardsPerToken(RewardsPerToken memory rewardsPerTokenIn)
        internal
        view
        returns (RewardsPerToken memory)
    {
        RewardsPerToken memory rewardsPerTokenOut = RewardsPerToken(
            rewardsPerTokenIn.accumulated,
            rewardsPerTokenIn.lastUpdated
        );
        uint256 totalWeightStaked_ = totalWeightStaked;

        // No changes if the program hasn't started
        if (block.timestamp < rewardsStart) return rewardsPerTokenOut;

        // Stop accumulating at the end of the rewards interval
        uint256 updateTime = block.timestamp < rewardsEnd
            ? block.timestamp
            : rewardsEnd;
        uint256 elapsed = updateTime - rewardsPerTokenIn.lastUpdated;

        // No changes if no time has passed
        if (elapsed == 0) return rewardsPerTokenOut;
        rewardsPerTokenOut.lastUpdated = updateTime.u128();

        // If there are no stakers we just change the last update time, the rewards for intervals without stakers are not accumulated
        if (totalWeightStaked == 0) return rewardsPerTokenOut;

        // Calculate and update the new value of the accumulator.
        rewardsPerTokenOut.accumulated = (rewardsPerTokenIn.accumulated +
            (1e18 * elapsed * rewardsRate) /
            totalWeightStaked_).u128(); // The rewards per token are scaled up for precision
        return rewardsPerTokenOut;
    }

    function updateStakeInfo(
        address _user,
        uint256 _amount,
        uint32 _lockDays,
        bool _type,
        uint256 _index
    ) internal {
        if (_type) {
            totalStaked += _amount;
            userStake[_user] += _amount;
            totalWeightStaked += _amount * _lockDays;
            userWeightStake[_user] += _amount * _lockDays;

            uint256 _unlockTime = block.timestamp + _lockDays * DAY_SECONDS;
            uint256 preStakingNum = stakingNum[msg.sender];
            uint256 _index = preStakingNum + 1;

            shares[msg.sender][_index] = LockedBalance({
                amount: _amount,
                unlockTime: _unlockTime,
                lockDays: _lockDays
            });
            stakingNum[msg.sender] = preStakingNum + 1;
        } else {
            totalStaked -= _amount;
            userStake[_user] -= _amount;
            totalWeightStaked -= _amount * _lockDays;
            userWeightStake[_user] -= _amount * _lockDays;

            shares[msg.sender][_index].amount -= _amount;
            if (shares[msg.sender][_index].amount == 0) {
                delete shares[msg.sender][_index];
                stakingNum[msg.sender] -= 1;
                if (stakingNum[msg.sender] == 0) {
                    delete (stakingNum[msg.sender]);
                }
            }
        }
    }
}

library Cast {
    function u128(uint256 x) internal pure returns (uint128 y) {
        require(x <= type(uint128).max, "Cast overflow");
        y = uint128(x);
    }
}
