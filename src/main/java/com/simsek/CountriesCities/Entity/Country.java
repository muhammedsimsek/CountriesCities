package com.simsek.CountriesCities.Entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
@Data
@Document(collection = "CountriesCities")
public class Country {

    @Field("id")
    private String id;
    private String name;
    private String iso2;
    private String iso3;
    private List<State> states;
}
