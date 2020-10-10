package com.wildchap.aop4;

import com.wildchap.aop2.UserService;

public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void alter() {
        System.out.println("修改了一个用户");
    }

    public void search() {
        System.out.println("查询了一个用户");
    }
}
