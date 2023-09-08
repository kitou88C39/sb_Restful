package com.liso.springboot.controller;

import java.util.List;

import com.liso.springboot.Pojos.CityRequest;
import com.liso.springboot.entities.City;
import com.liso.springboot.entities.Country;
import com.liso.springboot.services.CityService;
import com.liso.springboot.services.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    CityService cityService;
    @Autowired
    CourseService courseService;

    @GetMapping("sayhello")
    public String sayHello() {
        return "Hello User";
    }

    @GetMapping("getcities")
    public List<City> getCities() {
        return cityService.getCities();
    }

    @PostMapping("addcity")
    public City SaveCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @GetMapping("getcity")
    public City getCity(String cityname) {
        return cityService.getCity(cityname);
    }

    @PostMapping("savecity")
    public City addCity(@RequestBody CityRequest cityrequest) {
        return cityService.addCity(cityrequest);
    }

    @PostMapping("addcourse")
    public Course addCourse(@RequestBody CourseRequest courseRequest) {
        return courseService.addCourseWithContents(courseRequest);
    }

    @GetMapping("countrystartswith")
    public List<Country> countryStartWith(@RequestBody String countryname) {
        return cityService.findByCountrynameStartsWithOrderByPopulation(countryname);
    }

    @GetMapping("getcountries")
    public List<Country> getAllcountries() {
        return cityService.getAllcountries();
    }

    @GetMapping("getcountrycontating")
    public List<Country> getCountryContaining(@RequestBody String substring) {
        return cityService.getCountryContaining(substring);
    }

    @GetMapping("getcountry")
    public Country getCountry(@RequestBody int id) {
        return cityService.getCountry(id);
    }

    @GetMapping("getcountrybyname")
    public Country getCountryByName(@RequestBody String prefix) {
        return cityService.getCountryByName(prefix);
    }
}