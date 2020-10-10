package com.wildchap.aop3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//等会我们用这个累，动态生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理得接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成代理类得对象
    public Object getProxy(){

        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces()
                                , this);
    }

    //处理代理示例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //我们要执行得是rent得方法
        Object result = method.invoke(rent, args);
        return result;
    }
}
