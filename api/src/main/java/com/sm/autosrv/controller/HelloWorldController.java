package com.sm.autosrv.controller;

import com.sm.autosrv.domain.common.BizException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    @GetMapping("/")
    public String index() {
        return "Hello authsrv";
    }
}
