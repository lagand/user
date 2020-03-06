package com.cloud.user.controller.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriviledgeContrller {

    private static final Logger logger = LoggerFactory.getLogger(PriviledgeContrller.class);

    @RequestMapping("/getUser")
    public String getUser(@RequestParam(value = "name", required = false) String name) {
        logger.info(" recived user name : {}", name);
        return "user" + name;
    }
}
