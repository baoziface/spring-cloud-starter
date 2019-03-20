package com.example.springcloudconsumer.controller;

import com.example.springcloudconsumer.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @createBy guoqiang
 * @createTime 2019/3/9
 * @describe
 */
@RestController
public class ConsumerController {
    @Resource
    HelloRemote helloRemote;
    @RequestMapping("/hello/{name}")
    public  String index(@PathVariable("name") String name){
       return helloRemote.hello(name);
    } @RequestMapping("/hello/{name}")
    public  String index2(@PathVariable("name") String name){
        return helloRemote.hello2(name);
    }

}
