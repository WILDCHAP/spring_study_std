package com.wildchap.testproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//自动生成代理类
public class GenerateProxy implements InvocationHandler {
    // 被代理对象都实现了animal接口
    public animal animal;
    // 为该接口设置set方法
    public void setAnimal(com.wildchap.testproxy.animal animal) {
        this.animal = animal;
    }

    // 利用Proxy的newProxyInstance方法，获取被代理对象方法(返回的是被代理类共同实现的接口)
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), animal.getClass().getInterfaces(), this);
    }

    // 完善反射机制，指定执行内容
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //调用被代理类都实现了的接口方法
        Object result = method.invoke(animal, args);
        return result;
    }
}
