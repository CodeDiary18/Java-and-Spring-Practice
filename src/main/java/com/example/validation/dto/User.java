package com.example.validation.dto;

import com.example.validation.annotation.YearMonth;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Data
public class User {
    @NotBlank
    private String name;

    @Min(value = 1)
    @Max(value = 100)
    private int age;

    @Valid
    private List<Car> cars;
}