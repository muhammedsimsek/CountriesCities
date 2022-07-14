package com.simsek.CountriesCities.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class State {
    @Field("id")
    private Long id;
    private String name;
    private String state_code;
}
