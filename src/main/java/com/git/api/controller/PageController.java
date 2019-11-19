package com.git.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PageController {

    @RequestMapping("/index")
    public ModelAndView getUserName(){
        ModelAndView modelAndView = new ModelAndView("index");
        //分页
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
