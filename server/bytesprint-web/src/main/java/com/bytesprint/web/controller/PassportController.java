package com.bytesprint.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Passport Api
 *
 * @author Eason Liu
 * Create at: 2023/9/9
 */
@Slf4j
@RestController
@RequestMapping(produces = "application/json;charset=UTF-8", path = "/passport")
public class PassportController {
    @PostMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/auth")
    public String auth() {
        return "auth";
    }
}
