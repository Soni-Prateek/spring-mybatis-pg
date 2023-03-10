package com.prateek.mybatis.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.prateek.mybatis.spring.**",})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
