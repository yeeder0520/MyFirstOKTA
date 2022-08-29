package com.example.okta.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * 測試OKTA的API Controller
 *
 * @author YeeDer
 * @version 1.0.0
 * @since 2022/8/29 下午 01:47
 **/
@RestController
@Slf4j
public class TestController {

    @GetMapping("/")
    public String logout(Principal principal) {
        log.info("welcome");
        return "Hello: " + principal.getName();
    }

    @GetMapping("/signIn")
    public String signIn() {
        log.info("signIn");
        return "signIn success";
    }

    @GetMapping("/signOut")
    public String signOut() {
        log.info("signOut");
        return "signOut success";
    }
}
