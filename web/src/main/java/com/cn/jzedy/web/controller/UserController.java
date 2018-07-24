package com.cn.jzedy.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.cn.jzedy.web.mapper.UsersMapper;
import com.cn.jzedy.web.repository.Users;
import com.cn.jzedy.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @auther Jzedy
 * @time 2018/7/15 21:52
 * @description
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;


    @RequestMapping(value = "/test")
    public String test(Model model){
        Users users = userService.findOne("2");
        System.out.println(JSONObject.toJSONString(users));
        return "/user/test";
    }
}
