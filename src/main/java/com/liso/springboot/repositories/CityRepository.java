package com.liso.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repostory
public interface CityRepository extends JpaRepository<City, Long> {
    City findByCityname(String cityname);
}
