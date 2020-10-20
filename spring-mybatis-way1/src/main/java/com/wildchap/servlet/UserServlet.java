package com.wildchap.servlet;

import com.wildchap.dao.UserMapper;
import com.wildchap.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserServlet implements UserMapper {
    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> searchUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        return mapper.searchUser();
    }

}
