package com.cloud.user.redis;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;


@SpringBootTest
public class RedisTest {

    private final static Logger log = LoggerFactory.getLogger(RedisTest.class);

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test(){

//        redisTemplate.opsForValue().set("test", "value");
//        log.info("从redis 获取到结果 {} ", redisTemplate.opsForValue().get("test"));

//        redisTemplate.opsForValue().set("num", 0);
//        redisTemplate.opsForValue().increment("num");
//        log.info("从redis 获取到结果 {} ", redisTemplate.opsForValue().get("num"));

//        redisTemplate.opsForValue().set("time", 0, 5, TimeUnit.MINUTES);
//        redisTemplate.opsForValue().increment("time");
//        log.info("从redis 获取到结果 {} ", redisTemplate.opsForValue().get("time"));
//        log.info("从redis 获取到超时时间 {} ", redisTemplate.getExpire("time"));

        redisTemplate.opsForValue().increment("time");
        log.info("从redis 获取到结果 {} ", redisTemplate.opsForValue().get("time"));
        log.info("从redis 获取到超时时间 {} ", redisTemplate.getExpire("time"));
    }
}
