package com.wildchap.servlet;

import com.wildchap.dao.UserMapper;
import com.wildchap.pojo.User;
import com.wildchap.utils.MyBatis;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserServlet implements UserMapper{
    private static SqlSession sqlSession;
    private static UserMapper userMapper;

    public UserServlet(){
        sqlSession = MyBatis.getSqlSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }


    public List<User> getUser() {
        return userMapper.getUser();
    }
}
