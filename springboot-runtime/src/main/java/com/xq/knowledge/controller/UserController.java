package com.xq.knowledge.controller;


import com.xq.knowledge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{userid}")
    public String getUser(@PathVariable String userid){
        return userService.getUserById(userid).toString();
    }
}
