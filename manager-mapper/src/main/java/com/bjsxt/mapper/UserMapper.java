package com.bjsxt.mapper;

import com.bjsxt.pojo.User;

import java.util.List;

/**
 * @Author WP
 * @Date 2021/7/10
 * @Description TODO
 * @Version 1.0
 */
public interface UserMapper {

    void insertUser(User user);

    List<User> listUsers();

}
