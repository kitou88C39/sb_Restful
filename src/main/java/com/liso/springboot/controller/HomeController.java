package com.liso.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class HomeController {
    
    @Autowired
    CityService CityService;
    
    @GetMapping("sayhello")
    public String sayHello(){
        return "Hello User";
    }
    
    @GetMapping("getcities")
    public List<City> getCities(){
        return cityService.getCities();
    }

    @PostMapping("adddcity")
    public City SaveCity(@RequestBody City city){
        return cityService.saveCity(city);
    }

    @GetMapping("getcity")
    public City getCity(String cityname){
        return cityService.getCity(cityname);
    }
}
