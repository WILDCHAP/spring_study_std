package com.wildchap.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogByNote {

    @Before("execution(* com.wildchap.servlet.UserServlet.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }
}
