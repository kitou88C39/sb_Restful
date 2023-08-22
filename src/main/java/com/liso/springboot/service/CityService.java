package com.liso.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liso.springboot.repositories.CityRepository;

@Service
public class CityService {
    @Autowired CityRepository cityRepository;

    public List<city> getCities(){
        return cityresRepository.findAll();
    }

    public void getService(City city){
        cityresRepository.save(city);
    }
}
