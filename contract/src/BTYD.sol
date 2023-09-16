// SPDX-License-Identifier: MIT

pragma solidity ^0.8.2;

import "@openzeppelin/contracts/token/ERC20/ERC20.sol";
import "@openzeppelin/contracts/access/Ownable.sol";

contract BTYDToken is ERC20, Ownable {

    constructor(string memory name, string memory symbol) ERC20(name, symbol) {}

    /**
     * @dev Mint new token for the account
     * @param account The account being minted for
     * @param amount The amount being minted
     */
    function mint(address account, uint256 amount) external onlyOwner {
        _mint(account, amount);
    }

    /**
     * @dev Burn token from the account
     * @param account The account being burned from
     * @param amount The amount being burned
     */
    function burn(address account, uint256 amount) external onlyOwner {
        _burn(account, amount);
    }
}
