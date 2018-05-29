package com.lym.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication//开启自动配置
public class TestController {
    @RequestMapping("/index")
    private String hello(){
        System.out.println("第一个测试接口");
        return "第一个测试接口";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestController.class,args);
    }
}
