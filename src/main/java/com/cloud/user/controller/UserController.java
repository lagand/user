package com.cloud.user.controller;

import com.alibaba.fastjson.JSON;
import com.cloud.user.pojo.User;
import com.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserByName")
    public String getUser(String name){
        User user = userService.findByName(name);
        return JSON.toJSONString(user);
    }

    @RequestMapping("/getAllUser")
    public String  selectAll(){
        List<User> users = userService.selectAll();
        return JSON.toJSONString(users);
    }
}
