package com.penn.springboot.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
public class HelloSpringBoot {
    @RequestMapping("/index")
    public ModelAndView  sayHello(){
        ModelAndView mav = new ModelAndView("/views/items.jsp");
        mav.addObject("name", "Penn");
        mav.setViewName("index");
        return mav;
    }
}
