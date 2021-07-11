package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author WP
 * @Date 2021/7/11
 * @Description 跳转页面
 * @Version 1.0
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {

        return page;
    }

}
