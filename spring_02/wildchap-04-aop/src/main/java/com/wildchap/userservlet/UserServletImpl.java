package com.wildchap.userservlet;

//增删改查的具体实现类
public class UserServletImpl implements UserServlet{

    public void add() {
        System.out.println("在这里连接数据库，进行增加操作");
    }

    public void delete() {
        System.out.println("在这里连接数据库，进行删除操作");
    }

    public void update() {
        System.out.println("在这里连接数据库，进行修改操作");
    }

    public void query() {
        System.out.println("在这里连接数据库，进行查询操作");
    }
}
