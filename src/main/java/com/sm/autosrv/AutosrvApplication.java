package com.sm.autosrv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sm.autosrv.data.mapper")
public class AutosrvApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutosrvApplication.class, args);
    }
}
