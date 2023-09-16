// SPDX-License-Identifier: MIT

pragma solidity ^0.8.0;

import "@openzeppelin/contracts/access/Ownable.sol";
import "@openzeppelin/contracts/token/ERC20/IERC20.sol";
import "@openzeppelin/contracts/token/ERC20/utils/SafeERC20.sol";

contract SimpleStakingPool is Ownable {
    using SafeERC20 for IERC20;

    //质押token地址
    IERC20 stakeToken;

    uint256 public totalStaked; // Total amount staked
    mapping(address => LockedBalance) public userStake; // Amount staked per user

    uint256 constant DAY_SECONDS = 86400;

    event Stake(address indexed user, uint256 _amount, uint32 _lockDays);
    event Withdraw(address indexed user, uint256 _amount);

    struct LockedBalance {
        uint256 amount;
        uint256 unlockTime;
        uint32 lockDays;
    }

    //构造函数
    constructor(address _stakeTokenAddr) {
        stakeToken = IERC20(_stakeTokenAddr);
    }

    //质押代币
    function stake(uint256 _amount, uint32 _lockDays) external {
        require(_amount > 0, "stake amount must be large 0");
        require(_lockDays > 0, "_lockDays amount must be large 0");

        stakeToken.safeTransferFrom(msg.sender, address(this), _amount);
        totalStaked += _amount;
        uint256 _unlockTime = block.timestamp + _lockDays * DAY_SECONDS;

        userStake[msg.sender] = LockedBalance({
        amount : _amount,
        unlockTime : _unlockTime,
        lockDays : _lockDays
        });
        emit Stake(msg.sender, _amount, _lockDays);
    }

    function engineerWithdraw(uint256 _amount) external {
        require(_amount > 0, "withdraw amount must be large 0");
        require(
            userStake[msg.sender].amount >= _amount,
            "user stake balance must be large 0"
        );
        require(
            userStake[msg.sender].unlockTime <= block.timestamp,
            "unlock time error"
        );
        require(
            stakeToken.balanceOf(address(this)) >= _amount,
            "balance must be large 0"
        );
        stakeToken.safeTransfer(msg.sender, _amount);
        totalStaked -= _amount;
        emit Withdraw(msg.sender, _amount);
    }

    function getTotalStake() external view returns (uint256){
        return totalStaked;
    }

    function getUserStake() external view returns (uint256){
        return userStake[msg.sender].amount;
    }
}

