package com.wildchap.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class ExtendLogBefore implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "的" + method.getName() + "方法被执行了");
    }

}
