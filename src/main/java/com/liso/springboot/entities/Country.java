package com.liso.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.annotation.Generated;

@Entity
@Table(name = "cities")

public class Country {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Columne(name = "country_id")
private int id;

@Columne(name = "country_name")
private String countryname;







}
