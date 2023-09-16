// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Test, console2} from "forge-std/Test.sol";
import "../src/SimpleStakingPool.sol";
import "../src/BTYD.sol";

contract SimpleStakingPoolTest is Test {

    uint256 constant DAY_SECONDS = 86400;

    SimpleStakingPool public stakingPool;
    BTYDToken public  token;

    function setUp() public {
        token = new BTYDToken("bytd", "BTYD");
        token.mint(address(this), 1000);
        stakingPool = new SimpleStakingPool(address(token));
    }

    function test_stake() public {
        token.approve(address(stakingPool), 100);
        stakingPool.stake(100, 10);
        assertEq(stakingPool.getUserStake(), 100);
    }

    function test_getTotalStake() public {
        token.approve(address(stakingPool), 100);
        stakingPool.stake(100, 10);
        assertEq(stakingPool.getTotalStake(), 100);
    }

    function test_withdraw() public {
        token.approve(address(stakingPool), 100);
        stakingPool.stake(100, 1);
        assertEq(stakingPool.getTotalStake(), 100);
        vm.warp(block.timestamp + DAY_SECONDS);
        stakingPool.engineerWithdraw(100);
        assertEq(stakingPool.getTotalStake(), 0);
    }


}
