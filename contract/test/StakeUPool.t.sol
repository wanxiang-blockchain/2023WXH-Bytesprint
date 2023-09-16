// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.0;

import {Test, console2} from "forge-std/Test.sol";
import "../src/StakeUPool.sol";
import "../src/BTYD.sol";

contract StakeUPoolTest {
    IERC20 token;
    StakeUPool stakeUPool;

    function setUp() public {
        token = new BTYDToken("bytd", "BTYD");
        stakeUPool = new StakeUPool(token, address(this));
    }

    function test_stake() public {
        token.approve(address(stakeUPool), 100);
        stakeUPool.stake(100, 10, msg.sender);
        assertEq(stakeUPool.getTotalStaked(), 100);

        //        assertEq(stakeUPool.getTotalStaked(), 100);
    }

    //    function test_stake() public {
    //        token.approve(address(stakingPool), 100);
    //        stakingPool.stake(100, 10);
    //        assertEq(stakingPool.getUserStake(), 100);
    //    }
}
