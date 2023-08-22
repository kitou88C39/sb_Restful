package com.liso.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liso.springboot.repositories.CityRepository;

@Service
public class CityService {
    @Autowired CityRepository cityRepository;

    public CityService(){

    }

    public List<city> getCities(){
        return cityresRepository.findAll();
    }

    public City saveCity(City city){
        return cityresRepository.save(city);
    }

    public City getCities(String cityname){
        return cityresRepository.findByCityname();
    }
}
