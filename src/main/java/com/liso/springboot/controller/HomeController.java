package com.liso.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    CityService CityService;
    
    @GetMapping("sayhello")
    public String sayHello(){
        return "Hello User";
    }
    
     @GetMapping("getcities")
    public City getcities(){
        cityService.getCities();
    }
}
