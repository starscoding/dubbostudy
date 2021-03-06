package com.azxx.demon.consumer;

import com.azxx.demon.model.User;
import com.azxx.demon.service.MathService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.reger.dubbo.annotation.Inject;

@Component
public class DubboReferenceConsumer implements CommandLineRunner {
    // 使用dubbo原生注入
    @Reference
    public MathService service;
    // 使用兼容注入
    @Inject
    public MathService bidService;

    Integer a=1;
    Integer b=2;
    User user = new User(11,"测试","hello word !");

    @Override
    public void run(String... args) {
        System.err.println("注入的是同一个对象："+bidService.equals(service));
        System.err.printf("%s+%s=%s", a, b ,  bidService.add(a, b));
        System.err.println();
        System.err.printf("list=%s", bidService.toList(1, "22", true, 'b' , user));
        System.err.println();
        System.err.println(bidService.getUser(user));
        try {
            bidService.throwThrowable();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


}
