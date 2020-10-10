package com.wildchap.log;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//使用注解得方式实现
//标注这个类是一个切面类

@Aspect
public class DiyLog {
    @Before("execution(* com.wildchap.userservlet.UserServletImpl.*(..))")
    public void before(){
        System.out.println("在操作执行前");
    }
    @After("execution(* com.wildchap.userservlet.UserServletImpl.*(..))")
    public void after(){
        System.out.println("在操作执行后");
    }
}
