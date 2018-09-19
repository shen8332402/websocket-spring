package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/stringRedisTemplateTest")
    public String stringRedisTemplateTest(){
        stringRedisTemplate.opsForValue().set("demo1","demo1");
        return stringRedisTemplate.opsForValue().get("demo1");
    }
  @RequestMapping("/redisTemplateTest")
    public String redisTemplateTest(){
        redisTemplate.opsForValue().set("demo2","demo2");
        return (String) redisTemplate.opsForValue().get("demo2");
    }
}
