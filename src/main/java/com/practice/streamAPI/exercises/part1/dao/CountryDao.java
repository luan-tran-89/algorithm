package com.practice.streamAPI.exercises.part1.dao;

import com.practice.streamAPI.exercises.part1.domain.Country;

import java.util.List;
import java.util.Set;

/**
 * @author gasieugru
 */
public interface CountryDao {
    Country findCountryByCode(String code);

    Country removeCountry(Country country);

    Country addCountry(Country country);

    Country updateCountry(Country country);

    List<Country> findAllCountries();

    List<Country> findCountriesByContinent(String continent);

    Set<String> getAllContinents();
}
