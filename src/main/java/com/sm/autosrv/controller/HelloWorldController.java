package com.sm.autosrv.controller;

import com.sm.autosrv.domain.common.BizException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class HelloWorldController {
    @GetMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/bye")
    public String bye() {
        return "Bye";
    }

    @GetMapping("/exception")
    public String exception() throws Exception {
        throw new Exception("系统异常");
    }

    @GetMapping("/bizException")
    public String bizException() throws BizException {
        throw new BizException("业务异常");
    }
}
