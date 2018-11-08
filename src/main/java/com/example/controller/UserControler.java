package com.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserControler {

    @RequestMapping("/user")
public String first(){
    return "hey from user controller";
}


}
