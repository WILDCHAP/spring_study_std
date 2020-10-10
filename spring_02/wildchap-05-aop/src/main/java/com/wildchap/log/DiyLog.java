package com.wildchap.log;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//使用注解得方式实现
//标注这个类是一个切面类

@Aspect
public class DiyLog {
    @Before("execution(* com.wildchap.userservlet.UserServletImpl.*(..))")
    public void before() {
        System.out.println("在操作执行前");
    }

    @After("execution(* com.wildchap.userservlet.UserServletImpl.*(..))")
    public void after() {
        System.out.println("在操作执行后");
    }

    //在环绕增强中，我们可以给定一个参数，代长我们要获取处理切入的点;
    @Around("execution(* com.wildchap.userservlet.UserServletImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Object proceed = jp.proceed();     //执行方法
        System.out.println("环绕后");
    }

}
