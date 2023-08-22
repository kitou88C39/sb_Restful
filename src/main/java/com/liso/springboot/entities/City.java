package com.liso.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import jakarta.annotation.Generated;

@Entity
@Table(name = "cities")
public class City {
    
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_name")
    private String cityname;

    @Column(name = "citycode")
    private String citycode;

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

    public void setCityname(String citycode){
        this.citycode = citycode;
    }
}
