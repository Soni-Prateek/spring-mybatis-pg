package com.prateek.mybatis.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private BlifMapper blifMapper;

    @GetMapping("/test")
    public Object test() {
        return blifMapper.getData();
    }
}

