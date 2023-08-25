package com.liso.springboot.entities;

import java.beans.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Generated;

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

    @Column(name = "country_code", columnDefinition = "character varying(3) not null default 'NA'")
    private String citycode;

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

    public String getCountrycode(){
        return countrycode;
    }

    public void setCountrycode(String countrycode){
        this.countrycode = countrycode;
    }
}








}
