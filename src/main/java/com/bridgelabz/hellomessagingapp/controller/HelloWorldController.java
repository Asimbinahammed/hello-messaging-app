package com.bridgelabz.hellomessagingapp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello1")
    public String usingGetMethod(){
        return "Hello from bridgelabz";
    }

    @GetMapping(value = "/hello2")
    public String passingParameter(
           @RequestParam(name = "key") String key
    ){
        return "Hello " + key ;
    }
}
