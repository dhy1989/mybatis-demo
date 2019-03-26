package com.dhy.demo.controller;

import com.dhy.demo.entity.User;
import com.dhy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUser")
    public User getUser() {
        return userService.selectByPrimaryKey(1);
    }
}
