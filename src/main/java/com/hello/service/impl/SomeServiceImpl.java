package com.hello.service.impl;

import com.hello.service.SomeService;

public class SomeServiceImpl implements SomeService {

    private String name;

    public SomeServiceImpl() {
        System.out.println("SomeServiceImpl的无参数构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("执行了SomeServiceImpl的doSome()方法");
    }

    public void setName(String name) {
        this.name = name;
    }
}
