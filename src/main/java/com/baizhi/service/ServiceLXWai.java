package com.baizhi.service;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class ServiceLXWai implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("额外功能类代码1111");
    }
}
