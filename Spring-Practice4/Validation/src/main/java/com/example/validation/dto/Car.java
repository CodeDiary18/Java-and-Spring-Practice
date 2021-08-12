package com.example.validation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Car {
    @NotBlank
    private String name;

    @NotBlank
    @JsonProperty("car_number")
    private String carNumber;

    @NotBlank
    @JsonProperty("TYPE")
    private String type;

}