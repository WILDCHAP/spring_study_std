package com.wildchap.aop2;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userservice = new UserServiceImpl();
        //但是如果要在add等方法中加内容，每一个实现类得每一个方法都要加
        //非常的麻烦，这时候就要利用代理类了
        //userservice.add();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userservice);
        userServiceProxy.search();
    }
}
