package com.example.springcloudconsumer;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @createBy guoqiang
 * @createTime 2019/3/9
 * @describe
 */
@Component
public class HelloRemoteHystrix  implements  HelloRemote{
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello "+name+" this message send failed and the method is hello";
    }

    @Override
    public String hello2(String name) {
        return "hello "+name+" this message send failed and the method is hello2";
    }
}
