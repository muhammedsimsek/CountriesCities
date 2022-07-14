package com.simsek.CountriesCities.Service;

import com.simsek.CountriesCities.Entity.Country;
import com.simsek.CountriesCities.Entity.Dto.City;
import com.simsek.CountriesCities.Entity.State;
import com.simsek.CountriesCities.Repository.CountriesCitiesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    CountriesCitiesRepo countriesCitiesRepo;

    public List<Country> findAll(){
       return countriesCitiesRepo.findAll();
    }

    public List<Country> findCountry(String country){
        return countriesCitiesRepo.findByIso2(country);
    }

    public List<State> findCities(String country){
        Optional<Country> country1 = countriesCitiesRepo.findByIso2(country).stream().findFirst();
        return country1.get().getStates();
    }

    public City findCity(Long id){
        Optional<Country> country1 = countriesCitiesRepo.findByStates_Id(id).stream().findFirst();
        City city = new City();
        city.setCountry(country1.get().getName());
        city.setName(country1.get().getStates().get(0).getName());
        city.setCode(country1.get().getStates().get(0).getState_code());
        city.setId(country1.get().getStates().get(0).getId());
        return city;
    }
}
