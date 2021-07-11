package com.bjsxt.service.impl;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author WP
 * @Date 2021/7/11
 * @Description TODO
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insertUser(user);
    }

}
