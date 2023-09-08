package com.liso.springboot.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

    Country findById(int id);

    List<Country> findByCountrynameAndPopulationGreaterThanEqual(String coutryname, long population);

    List<Country> findByCountrynameAndPopulationLessThanEqual(String coutryname, long population);

    List<Country> findByCountrynameAndPopulationLessThan(String coutryname, long population);

    List<Country> findByCountrynameAndPopulationGreaterThan(String coutryname, long population);

    List<Country> findByCountrynameStartsWithOrderByPopulationAsc(String prefix);

    ＠Query("select c from Country c where c.countryname like ?1% ORDER BY c.population ASC")

    List<Country> getByCountryname(String prefix);

    List<Country> findByCountrynameStartsWithOrderByPopulationDesc(String sufix);

    List<Country> findByCountrynameStartsWith(String prefix);

    List<Country> findByCountrynameEndsWith(String sufix);

    List<Country> findByCountrynameContaining(String subString);
}
