package com.wildchap.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {

    //相比于前置，它多了一个返回值(执行method后的返回值)
    public void afterReturning(Object resultValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + target.getClass().getName() + "的" + method.getName() + "方法,返回结果为：" + resultValue);
    }
}
