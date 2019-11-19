package com.git.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUserName")
    public ModelAndView getUserName(){
        ModelAndView modelAndView = new ModelAndView("index");
        //分页
        modelAndView.setViewName("user/user");
        modelAndView.addObject("name","张三");
        return modelAndView;
    }

}
