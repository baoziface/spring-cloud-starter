package com.example.builddockerfile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @createBy guoqiang
 * @createTime 2019/3/11
 * @describe
 */
@RestController
public class HelloWorldController {
    @RequestMapping("hello")
    public String hello(){
        return  "hello world!!!";
    }
}
