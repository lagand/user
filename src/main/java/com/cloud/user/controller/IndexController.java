package com.cloud.user.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cloud.user.pojo.Greeting;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class IndexController {

    private static final String template = "hello, %s!";

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("/helloJson")
    public Greeting helloJson(){
        return new Greeting(counter.incrementAndGet(), String.format(template, "this is content"));
    }

}
