package com.lym.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication//开启自动配置
public class TestController {
    Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/index")
    private String hello(){
        // System.out.println("第一个测试接口");
        logger.debug("测试一个debug级别的日志");
        logger.error("测试一个error级别的日志");
        logger.info("测试一个info级别的日志");
        return "第一个测试接口";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestController.class,args);
    }
}
