// SPDX-License-Identifier: MIT
pragma solidity 0.8.21;

import "@openzeppelin/contracts/access/Ownable.sol";
import "@openzeppelin/contracts/token/ERC20/IERC20.sol";
import "@openzeppelin/contracts/token/ERC20/utils/SafeERC20.sol";

contract StakeUPool is Ownable {
    struct LockedBalance {
        //who can withdraw this balance
        address withdrawAddr;
        uint256 amount;
        uint256 unlockTime;
        uint32 lockDays;
        bool isLock;
    }

    struct LockedBalanceWithIndex {
        uint32 index;
        LockedBalance lockedBalance;
    }

    //State
    uint256 constant DAY_SECONDS = 86400;

    using SafeERC20 for IERC20;
    IERC20 public stakeToken;
    uint256 public totalStaked;
    mapping(address => uint256) userStake;
    address public governance;


    //每个user质押的数量
    mapping(address => uint32) private stakingNum;
    //某地址的质押代币detail
    mapping(address => mapping(uint32 => LockedBalance)) private shares;

    //event
    event Stake(address indexed _addr, uint256 _amount, uint32 _lockDays);
    event Withdraw(address indexed _addr, uint32 _index, uint256 _amount);
    event IncreaseAmount(address indexed _addr, uint256 _amount, uint32 _index);
    event Lock(address indexed _addr, uint32 _index);
    event Unlock(address indexed _addr, uint32 _index);

    //error

    //modifier
    modifier onlyGovernance() {
        require(governance == msg.sender, "sender is not governance");
        _;
    }

    constructor(IERC20 _stakeToken, address _governance) {
        stakeToken = _stakeToken;
        governance = _governance;
    }


    function stake(uint256 _amount, uint32 _lockDays, address _withdrawAddr) external {
        require(_amount > 0, "stake amount must be large than 0");
        require(_lockDays > 0, "_lockDays amount must be large than 0");
        stakeToken.safeTransferFrom(msg.sender, address(this), _amount);
        updateStakeInfo(msg.sender, _withdrawAddr, _amount, _lockDays, 0, true);
        emit Stake(msg.sender, _amount, _lockDays);
    }

    function withdraw(uint256 _amount, uint32 _index) external {
        require(_amount > 0, "withdraw amount must be large than 0");
        require(_index > 0, "_index must be large than 0");
        require(shares[msg.sender][_index].withdrawAddr == msg.sender, "this sender is not the withdrawAddr");
        require(
            !shares[msg.sender][_index].isLock,
            "this staked balance is be locked"
        );
        require(
            shares[msg.sender][_index].amount > _amount,
            "staked balance less _amount"
        );
        require(
            shares[msg.sender][_index].unlockTime <= block.timestamp,
            "unlock time has not arrived yet"
        );

        stakeToken.safeTransfer(msg.sender, _amount);
        updateStakeInfo(msg.sender, address(0), _amount, 0, _index, false);
        emit Withdraw(msg.sender, _index, _amount);

    }

    function increaseStakeAmount(uint256 _amount, uint32 _index) public {
        require(_amount > 0, "amount must be large than 0");
        require(_index > 0, "_index must be large than 0");
        require(
            shares[msg.sender][_index].amount > 0,
            "some token must be staked before"
        );
        stakeToken.safeTransferFrom(msg.sender, address(this), _amount);
        updateStakeInfo(msg.sender, address(0), _amount, 0, _index, true);
        emit IncreaseAmount(msg.sender, _amount, _index);
    }

    function getTotalStaked() public view returns (uint256){
        return totalStaked;
    }

    function getUserStaked() public view returns (uint256){
        return userStake[msg.sender];
    }

    function getUserStakedList() external view returns (LockedBalanceWithIndex[] memory){
        uint32 currentNum = stakingNum[msg.sender];
        LockedBalanceWithIndex[] memory list = new LockedBalanceWithIndex[](currentNum);
        for (uint32 i = 0; i < currentNum; i++) {
            LockedBalanceWithIndex memory balance = LockedBalanceWithIndex({
            index : i,
            lockedBalance : shares[msg.sender][i]
            });

            list[i] = balance;
        }
        return list;
    }

    function lock(address _addr, uint32 _index) external onlyGovernance {
        require(_addr != address(0), "address can not be 0");
        require(_index > 0, "_index can not be 0");
        require(shares[_addr][_index].amount > 0, "amount must larger than 0");
        shares[_addr][_index].isLock = true;
        emit Lock(_addr, _index);

    }

    function unlock(address _addr, uint32 _index) external onlyGovernance {
        require(_addr != address(0), "address can not be 0");
        require(_index > 0, "_index can not be 0");
        require(shares[_addr][_index].amount > 0, "amount must larger than 0");
        shares[_addr][_index].isLock = false;
        emit Unlock(_addr, _index);
    }

    function setGovernance(address _governance) external onlyOwner {
        governance = _governance;
    }

    function updateStakeInfo(
        address _user,
        address _withdrawAddr,
        uint256 _amount,
        uint32 _lockDays,
        uint32 _index,
        bool _type
    ) internal {
        if (_type) {
            totalStaked += _amount;
            userStake[_user] += _amount;
            uint256 _unlockTime = block.timestamp + _lockDays * DAY_SECONDS;
            if (_index == 0) {
                uint32 preStakingNum = stakingNum[msg.sender];
                uint32 index = preStakingNum + 1;
                shares[msg.sender][index] = LockedBalance({
                withdrawAddr : _withdrawAddr,
                amount : _amount,
                unlockTime : _unlockTime,
                lockDays : _lockDays,
                isLock : false
                });
                stakingNum[msg.sender] = index;
            } else {
                shares[msg.sender][_index].amount += _amount;
            }
        } else {
            totalStaked -= _amount;
            userStake[_user] -= _amount;
            shares[msg.sender][_index].amount -= _amount;
            if (shares[msg.sender][_index].amount == 0) {
                delete shares[msg.sender][_index];
                uint32 currentNum = stakingNum[msg.sender];
                //move last to _index
                if (_index != currentNum) {
                    shares[msg.sender][_index] = shares[msg.sender][currentNum];
                }
                stakingNum[msg.sender] -= 1;
                if (stakingNum[msg.sender] == 0) {
                    delete (stakingNum[msg.sender]);
                }
            }
        }
    }
}
