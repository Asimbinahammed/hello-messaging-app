package com.bridgelabz.hellomessagingapp.controller;

import com.bridgelabz.hellomessagingapp.dto.NameDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class HelloWorldController {
    Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    //http://localhost:8080/hello/home
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz!!!";
    }

    //http://localhost:8080/hello/query?name=Asim
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    //http://localhost:8080/hello/param/Asim
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    //http://localhost:8080/hello/post
    @PostMapping("/post")
    public String sayHello(@RequestBody NameDto user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    //http://localhost:8080/hello/param
    @PutMapping("/param/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
