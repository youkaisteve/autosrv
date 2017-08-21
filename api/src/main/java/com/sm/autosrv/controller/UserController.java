package com.sm.autosrv.controller;

import com.sm.autosrv.service.interfaces.dataservice.UserService;
import com.sm.autosrv.service.interfaces.entity.ApplicationUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by youkai on 2017/8/15.
 */

@RestController
@RequestMapping("/users")
public class UserController {
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserService userService;

    public UserController(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody ApplicationUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userService.save(user);
    }

    @GetMapping("/list")
    public ArrayList<ApplicationUser> getUserList() {
        return userService.getUserList();
    }
}
