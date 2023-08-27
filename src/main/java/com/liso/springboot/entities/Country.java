package com.liso.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.JsonIgnore;



@Entity
@Table(name = "countries")

public class Country {
    
    @Id
    @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @Column(name = "country_name")
    private String countryname;

    @OneToMany
    @JoinColumn(name = "country_id")
    private Set<City> cities;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    
    public String getCountryname(){
        return countryname;
    }

    public void setCountryname(String countryname){
        this.countryname = countryname;
    }

    public Set<City> getCities(){
        return cities;
    }

    public void setCities(Set<City> cities){
        this.cities = cities;
    }
}

