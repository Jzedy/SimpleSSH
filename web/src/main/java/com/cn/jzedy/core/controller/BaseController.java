package com.cn.jzedy.core.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther Jzedy
 * @time 2018/7/15 21:50
 * @description
 */
@ControllerAdvice
public class BaseController {

    protected static final String REDIECT = "redirect:";


    @ModelAttribute
    public void getPath(HttpServletRequest request, Model model){
        model.addAttribute( "ctx", request.getContextPath() );
    }

    /**
     * 统一异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map errorHandler(Exception e){
        e.printStackTrace();
        Map map = new HashMap();
//        map.put("code", ResponseContents.KEY_ERROR);
//        map.put("msg",e.getMessage());
        return map;
    }

}

