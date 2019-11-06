package com.baizhi.service;

public class ServiceLXImpl implements ServiceLX{
    @Override
    public void insert1(String name) {
        System.out.println("处理业务的insert1方法");
        System.out.println("调用dao方法");
    }

    @Override
    public void insert2() {
        System.out.println("处理业务的insert2方法");
        System.out.println("调用dao方法");
    }

    @Override
    public void delete(String a) {
        System.out.println("处理业务的逻delete方法");
        System.out.println("调用dao方法");
    }

    @Override
    public void update() {
        System.out.println("处理业务的update方法");
        System.out.println("调用dao方法");
    }
}
