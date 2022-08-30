package com.example.okta.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 請求路徑配置
 *
 * @author YeeDer
 * @version 1.0.0
 * @since 2022/8/30 上午 11:37
 **/
@Configuration
class OktaOAuth2WebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /*一切都需要授權*/
        RequireAuthorizationForEverything(http);
        /*允許匿名訪問特定路由*/
//        AllowAnonymousAccessForSpecificRoutes(http);
    }

    /**
     * 一切都需要授權
     *
     * @param http http
     * @throws Exception Exception
     */
    private void RequireAuthorizationForEverything(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated() // All requests require authentication
                .and()
                .oauth2ResourceServer().jwt(); // validates access tokens as JWTs
    }

    /**
     * 允許匿名訪問特定路由
     *
     * @param http http
     * @throws Exception Exception
     */
    private void AllowAnonymousAccessForSpecificRoutes(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // Require authentication for all requests under /api/private
                .antMatchers("/api/whoami").authenticated()
                .and()
                .oauth2ResourceServer().jwt();
    }
}

