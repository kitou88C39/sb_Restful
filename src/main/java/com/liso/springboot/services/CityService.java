package com.liso.springboot.services;

import java.util.List;

import com.liso.springboot.Pojos.CityRequest;
import com.liso.springboot.entities.City;
import com.liso.springboot.entities.Country;
import com.liso.springboot.repositories.CityRepository;
import com.liso.springboot.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;
    @Autowired
    CountryRepository countryRepository;

    public CityService() {

    }

    public List<City> getCities() {
        return cityresRepository.findAll();
    }

    public City saveCity(City city) {
        return cityresRepository.save(city);
    }

    public City getCities(String cityname) {
        return cityresRepository.findByCityname(cityname);
    }

    public City addCity(CityRequest cityrequest) {
        Country country = countryRepository.findById(cityrequest.country_id);

        City city = new City();
        city.setCityname(cityrequest.cityname);
        city.setCitycode(cityrequest.citycode);
        city.setCountry(country);

        return cityresRepository.save(city);
    }

    public List<City> findByCountryNameStartsWithOrderByPopulation(String countryname) {
        return cityresRepository.findByCountryNameStartsWithOrderByPopulation(countryname);
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll(Sort.by(Direction.ASC, "population"));
    }

    public List<City> getCountryContaining(String substring) {
        return cityresRepository.findByCountrynameContaining(substring);
    }

    public Country getCountry(int id) {
        return countryRepository.getById(id);
    }

    public List<Country> getCountryByName(String prefix) {
        return countryRepository.getByCountryname(prefix);
    }
}
