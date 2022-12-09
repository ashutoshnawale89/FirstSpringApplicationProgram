package com.bridgelabz.program.myfirstspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {


    //UC---1
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


    // UC---2
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String name){
        return "Hello"+name+"From Bridgelabz!!!";
    }


    //UC---3
    @RequestMapping(value = {"/query/{username}"},method = RequestMethod.GET)
    @ResponseBody
    public String sayHelloPath(@PathVariable(value = "username")String name){
        return "Hello  "+name+"  From Bridgelabz!!!";
    }
}
