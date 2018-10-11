package com.azxx.demon.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
