package com.liso.springboot.repositories;


import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {

    Country findById(int id);
    
}
