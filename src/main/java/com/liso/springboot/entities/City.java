package com.liso.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "cities")
public class City {
    
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @Column(name = "city_name")
    private String cityname;

    @Column(name = "citycode", columnDefinition = "character varying(3) not null default 'NA'")
    private String citycode;

    @Transient
    private String beanid;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    
    public String getCityname(){
        return cityname;
    }

    public void setCityname(String cityname){
        this.cityname = cityname;
    }

    public String getCitycode(){
        return citycode;
    }

    public void setCitycode(String citycode){
        this.citycode = citycode;
    }

    public String getBeanid(){
        return beanid;
    }

    public void setBeanid(String beanid){
        this.beanid = beanid;
    }

    public Country getCountry(){
        return country;
    }

    public void setCountry(Country country){
        this.country = country;
}
