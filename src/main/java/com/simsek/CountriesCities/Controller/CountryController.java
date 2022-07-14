package com.simsek.CountriesCities.Controller;

import com.simsek.CountriesCities.Entity.Country;
import com.simsek.CountriesCities.Entity.Dto.City;
import com.simsek.CountriesCities.Entity.State;
import com.simsek.CountriesCities.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryController {
    @Autowired
    CountryService countryService;

    @GetMapping("/countries")
    public List<Country> getAllCountries(){
        return countryService.findAll();
    }

    @GetMapping("/country")
    public List<Country> getCountry(@RequestParam String iso){
        return  countryService.findCountry(iso);
    }

    @GetMapping("/cities")
    public List<State> getAllCities(@RequestParam String iso){
        return  countryService.findCities(iso);
    }

    @GetMapping("/city")
    public City getCity(@RequestParam Long id){
        return  countryService.findCity(id);
    }
}
