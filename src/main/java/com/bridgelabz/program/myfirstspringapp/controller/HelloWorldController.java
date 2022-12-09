package com.bridgelabz.program.myfirstspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
@RequestMapping(value = "/hello", method = RequestMethod.GET)
@ResponseBody
    public String helloMessage(){
        return "Hello Bridgelabz .... I am Ashutosh ";
    }

    @RequestMapping(value = "/friend",method = RequestMethod.GET)
    @ResponseBody
    public String friendHello(){
    return "Hello Yogesh ";
    }
}
