package com.wildchap.aop4;

import com.wildchap.aop2.UserService;

public class Client {
    public static void main(String[] args) {
        //真实角色（要被代理得）
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色动态生成
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //1. 设置要被代理得对象(不是接口，而是实现接口得对象)
        pih.setTarget(userService);
        //2. 获取要被代理对象得代理类，例如获取房东得代理--中介，生成结婚得代理--婚介
        UserService proxy = (UserService) pih.getProxy();
        //3. 利用代理执行被代理对象得方法
        proxy.add();
    }
}
