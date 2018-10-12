package com.azxx.demon.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.azxx.demon.exception.TestRuntimeException;
import com.azxx.demon.model.User;
import com.reger.dubbo.annotation.Export;

//@Service(protocol="dubbo-jvm",registry="test2")
@Export (protocol="dubbo",registry="test")
public class MathServiceImpl implements MathService {

    @Override
    public Integer add( Integer a, Integer b) {
        System.err.println("请求到达  " + a + "+" + b + "=" + (a + b));
        return a + b;
    }

    @Override
    public List<Object> toList(Object... args) {
        List<Object> list = new ArrayList<Object>();
        Collections.addAll(list, args);
        System.err.println("返回的数据"+list);
        return list;
    }
    @Override
    public void throwThrowable() {
        throw new TestRuntimeException("专门抛出一个异常试试异常时！");
    }

    @Override
    public User getUser(User user) {
        System.err.println("请求到达  " +user);
        return user;
    }
}
