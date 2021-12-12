package com.github.robsonspires.citiesapi.countries;

import com.github.robsonspires.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}