package com.wildchap.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class ExtendLogAfter implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(o1.getClass().getName() + "的" + method.getName() + "方法执行完成！结果为" + o.toString());
    }
}
