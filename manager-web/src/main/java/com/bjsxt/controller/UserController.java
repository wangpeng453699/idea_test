package com.bjsxt.controller;

import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author WP
 * @Date 2021/7/11
 * @Description TODO
 * @Version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String addUser(User user) {
        userService.addUser(user);

        return "ok";
    }

}
