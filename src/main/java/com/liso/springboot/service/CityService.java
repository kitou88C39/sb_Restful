package com.liso.springboot.service;

import java.util.List;

import com.liso.springboot.Pojos.CityRequest;
import com.liso.springboot.entities.City;
import com.liso.springboot.repositories.CityRepository;
import com.liso.springboot.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CityService {
    @Autowired CityRepository cityRepository;
    @Autowired CountryRepository countryRepository;

    public CityService(){

    }

    public List<City> getCities(){
        return cityresRepository.findAll();
    }

    public City saveCity(City city){
        return cityresRepository.save(city);
    }

    public City getCities(String cityname){
        return cityresRepository.findByCityname(cityname);
    }

    public City saveCity(City city){
        return cityresRepository.save(city);
    }

    public City getCities(String cityname){
        return null;
    }

}
