package com.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/first")
    public String hello(){
        return "hello imoh welcome to this project";
    }
}
