package com.liso.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("sayhello")
    public String sayHello(){
        return "Hello User";
    }
    
}
