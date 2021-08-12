package com.example.hello.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CarDto {
    private String name;

    @JsonProperty("car_number")
    private String carNumber;
}
