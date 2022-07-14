package com.simsek.CountriesCities;

import com.simsek.CountriesCities.Entity.Dto.City;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

public class CityTests {

    @Test
    public void testGetCity() {
        String URI = "http://localhost:8081/api/city?id={id}";
        RestTemplate restTemplate = new RestTemplate();
        City city = restTemplate.getForObject(URI, City.class, "2212");
        Assert.isTrue(city.getId() ==2212L,"City id must be 2212");
    }
}
