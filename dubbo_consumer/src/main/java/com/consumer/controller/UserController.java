package com.consumer.controller;

import com.api.pojo.User;
import com.consumer.service.LocalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private LocalUserService localUserService;

    @RequestMapping("findUser")
    public User findUser(Long id){
        return localUserService.getById(id);
    }
    @RequestMapping("registerUser")
    public String register(User user){
        localUserService.register(user);
        return "注册用户成功";
    }
}