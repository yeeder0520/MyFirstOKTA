package com.example.okta.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

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

    @GetMapping("/api/hello")
    public String anon() {
        return "(凸￣ 3￣)凸(凸￣ 3￣)凸";
    }

    @GetMapping("/api/whoami")
    public Map<String, Object> whoami(Authentication authentication) {
        // return information about the token
        return (Map<String, Object>) authentication.getDetails();
    }

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
