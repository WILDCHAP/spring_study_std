package com.wildchap.dao;

import com.wildchap.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int addUser(User user);
    int delUser(@Param("id") int id);
    int updateUser(User user);
    List<User> searchUser();
}
