package com.azxx.demon.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
