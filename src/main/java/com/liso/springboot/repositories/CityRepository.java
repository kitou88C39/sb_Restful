package com.liso.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.repository;

@Respostory
public interface CityRepository extends JpaRepository<City,Long>{
    
}
