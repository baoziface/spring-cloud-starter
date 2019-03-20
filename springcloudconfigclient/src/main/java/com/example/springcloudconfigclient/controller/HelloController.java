package com.example.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @createBy guoqiang
 * @createTime 2019/3/10
 * @describe
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${neo.hello}")
    private String hello;
    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
