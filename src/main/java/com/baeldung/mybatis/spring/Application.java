package com.baeldung.mybatis.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.baeldung.mybatis.spring.**",})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
