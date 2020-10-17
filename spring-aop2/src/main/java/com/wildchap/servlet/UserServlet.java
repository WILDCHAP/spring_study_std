package com.wildchap.servlet;

import com.wildchap.dao.UserMapper;
import com.wildchap.pojo.User;
import com.wildchap.utils.MyBatis;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserServlet implements UserMapper {

    private static SqlSession sqlSession;

    public UserServlet(){
        sqlSession = MyBatis.getSqlSession();
    }

    @Override
    protected void finalize(){
        sqlSession.close();
    }

    public int addUser(User user) {
        return sqlSession.getMapper(UserMapper.class).addUser(user);
    }

    public int delUser(int id) {
        return sqlSession.getMapper(UserMapper.class).delUser(id);
    }

    public int updateUser(User user) {
        return sqlSession.getMapper(UserMapper.class).updateUser(user);
    }

    public List<User> searchUser() {
        return sqlSession.getMapper(UserMapper.class).searchUser();
    }

}
