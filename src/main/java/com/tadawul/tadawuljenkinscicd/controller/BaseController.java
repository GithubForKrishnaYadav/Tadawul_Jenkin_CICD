package com.tadawul.tadawuljenkinscicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/home")
public class BaseController {
    @GetMapping("/")
    public String sayHello(){
        String returnText = "Hello Tadawul.. Welcome to CICD.. Happy coding guys..";
        return returnText;
    }
}
