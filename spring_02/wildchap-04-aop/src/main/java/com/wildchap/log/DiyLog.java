package com.wildchap.log;


//自定义切面类
public class DiyLog {
    public void before(){
        System.out.println("在操作执行前");
    }
    public void after(){
        System.out.println("在操作执行后");
    }
}
