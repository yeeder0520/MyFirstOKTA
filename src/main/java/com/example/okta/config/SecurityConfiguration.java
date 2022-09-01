//package com.example.okta.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//
///**
// * @author YeeDer
// * @version 1.0.0
// * @since 2022/8/30 下午 04:33
// **/
//@EnableWebSecurity
//public class SecurityConfiguration {
//    @Bean
//    SecurityFilterChain oauth2SecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeRequests((requests) -> requests.anyRequest().authenticated());
//
//        // enables OAuth redirect login
//        http.oauth2Login();
//
//        // enables OAuth Client configuration
//        http.oauth2Client();
//
//        // enables REST API support for JWT bearer tokens
//        http.oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
//
//        return http.build();
//    }
//}
