package com.baizhi.service;

public class ServiceDynamicproxy implements ServiceLX{
    @Override
    public void insert1(String name) {
        System.out.println("我是原始方法执行之前执行的额外功能");
        ServiceLX s=new ServiceLXImpl();
        s.insert1("小香");
    }

    @Override
    public void insert2() {
        System.out.println("我是原始方法执行之前执行的额外功能");
        ServiceLX s=new ServiceLXImpl();
        s.insert2();
    }

    @Override
    public void delete(String a) {
        System.out.println("我是原始方法执行之前执行的额外功能");
        ServiceLX s=new ServiceLXImpl();
        s.delete("dd");
    }

    @Override
    public void update() {
        System.out.println("我是原始方法执行之前执行的额外功能");
        ServiceLX s=new ServiceLXImpl();
        s.update();
    }
}
