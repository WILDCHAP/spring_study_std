package com.wildchap.aop2;

public class UserServiceProxy implements UserService{

    private UserServiceImpl userservice;

    public UserServiceProxy(){}

    public UserServiceProxy(UserServiceImpl userservice) {
        this.userservice = userservice;
    }

    //加一个日志方法
    public void log(String msg){
        System.out.println("使用了" + msg + "方法");
    }

    public void add() {
        log("add");
        userservice.add();
    }

    public void delete() {
        log("delete");
        userservice.add();
    }

    public void alter() {
        log("alter");
        userservice.add();
    }

    public void search() {
        log("search");
        userservice.add();
    }
}
