package com.simsek.CountriesCities.Repository;

import com.simsek.CountriesCities.Entity.Country;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CountriesCitiesRepo extends MongoRepository<Country,String> {

   public List<Country> findByIso2(String iso2);

  public List<Country> findByStates_Id(Long id);


}
