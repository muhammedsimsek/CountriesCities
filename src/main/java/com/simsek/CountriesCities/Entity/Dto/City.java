package com.simsek.CountriesCities.Entity.Dto;

import lombok.Data;
import org.apache.logging.log4j.message.LocalizedMessage;

@Data
public class City {
    private Long id;
    private String name;
    private String code;
    private String country;
}
