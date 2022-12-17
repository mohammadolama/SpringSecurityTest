package com.example.springsecuritytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SpringSecurityTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityTestApplication.class, args);
    }


}
