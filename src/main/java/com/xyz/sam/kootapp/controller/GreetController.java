package com.xyz.sam.kootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {

    @GetMapping("/greetme")
    public String greetMe(){
        return "Hi there, Have a nice day....";
    }

    @GetMapping("/greetme/{name}")
    public String greetMe(@PathVariable ("name") String name ){
        return "Hi "+name+", Have a nice day....";
    }
}
