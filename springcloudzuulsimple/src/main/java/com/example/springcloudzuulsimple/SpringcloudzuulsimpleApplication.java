package com.example.springcloudzuulsimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringcloudzuulsimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudzuulsimpleApplication.class, args);
    }

}
