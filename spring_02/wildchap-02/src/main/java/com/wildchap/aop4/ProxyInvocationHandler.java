package com.wildchap.aop4;

import com.wildchap.aop3.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//等会我们用这个累，动态生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理得接口
    private Object target;

    //获取它的接口
    public void setTarget(Object target) {
        this.target = target;
    }

    //根据被代理类和被代理类得接口，生成代理类得对象
    public Object getProxy(){
        //参数分别是，代理对象类，接口类，和当前
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces()
                                , this);
    }

    //处理代理示例并返回结果，也就是调用上面获取代理对象后
    //利用代理对象调用被代理类的方法的执行结果(反射)
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //这里还可以在执行接口方法前加自己想执行的方法
        log(method.getName());

        //我们要执行得是target得方法
        Object result = method.invoke(target, args);
        return result;
    }

    //添加独有的日志功能
    public void log(String msg){
        System.out.println("执行了" + msg + "方法");
    }
}
