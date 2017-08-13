package com.sm.autosrv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class HelloWorldController {
    @GetMapping("/hello")
    public String index() {
        return "Hello World1";
    }

    @GetMapping("/bye")
    public String bye() {
        return "Bye";
    }
}
