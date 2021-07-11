package com.bjsxt.test;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author WP
 * @Date 2021/7/10
 * @Description TODO
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ManagerTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertUserTest() {
        User user = new User();
        user.setUsername("李四");
        user.setUserage(25);

        userMapper.insertUser(user);
    }

}
