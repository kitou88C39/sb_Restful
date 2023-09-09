package com.liso.springboot.repositories;

import org.springframework.stereotype.Repository;

import com.liso.springboot.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

    Country findById(int id);

    @Query("from Country where id = ?1")
    Country getById(int id);

    List<Country> findByCountrynameAndPopulationGreaterThanEqual(String countryname, long population);

    List<Country> findByCountrynameAndPopulationLessThanEqual(String countryname, long population);

    List<Country> findByCountrynameAndPopulationLessThan(String countryname, long population);

    List<Country> findByCountrynameAndPopulationGreaterThan(String countryname, long population);

    List<Country> findByCountrynameStartsWithOrderByPopulationAsc(String prefix);

    @Query("select c from Country c where c.countryname like ?1% ORDER BY c.population ASC")
    List<Country> getByCountryname(String prefix);

    @Query(value = "select c.countryname,c.population from Country c where c.countryname like :countryname% and c.population >= :population")
    List<Object[]> findByCountrynameAndPopulation(@Param("countryname") String countryname,
            @Param("poplatuin") long population);

    @Query("select c.country_name,c.population from countries c where c.country_name like :countryname% and c.population >= :population, nativeQuery=true")
    List<Object[]> findByCountrynameAndPopulationNative(@Param("countryname") String countryname,
            @Param("poplatuin") long population);

    List<Country> findByCountrynameStartsWithOrderByPopulationDesc(String suffix);

    List<Country> findByCountrynameStartsWith(String prefix);

    List<Country> findByCountrynameEndsWith(String suffix);

    List<Country> findByCountrynameContaining(String subString);
}
