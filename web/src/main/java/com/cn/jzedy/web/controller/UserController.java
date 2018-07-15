package com.cn.jzedy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther Jzedy
 * @time 2018/7/15 21:52
 * @description
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/test")
    public String test(Model model){
        return "/user/test";
    }
}
