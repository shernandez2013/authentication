package com.siheca.authentication.configuration;

import com.siheca.authentication.service.UserService;
import com.siheca.authentication.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }
}
