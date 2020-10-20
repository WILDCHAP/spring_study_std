package com.wildchap.servlet;

import com.wildchap.dao.UserMapper;
import com.wildchap.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserServlet implements UserMapper {

    //在该类中利用sqlsessiontemplate连接数据库
    private SqlSessionTemplate sqlSession;

    //设置set方法
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> searchUser1() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        return mapper.searchUser1();
    }
}
