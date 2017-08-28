package com.sm.autosrv;

import com.sm.autosrv.data.serviceimpl.UserServiceImpl;
import com.sm.autosrv.service.interfaces.dataservice.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AutosrvApplication {
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    public static void main(String[] args) {
        SpringApplication.run(AutosrvApplication.class, args);
    }
}