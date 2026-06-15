package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {
        security
                .csrf(csrf->csrf.disable())
                .authorizeHttpRequests(auth->auth
                        .requestMatchers(new RegexRequestMatcher("(?i).*\\/secure\\/.*",null,true)).authenticated()
                        .requestMatchers(new RegexRequestMatcher("(?i).*\\/public\\/.*",null,true)).permitAll()
                        .anyRequest().permitAll()
                )
                .httpBasic(Customizer.withDefaults());
      return security.build();
    }
}