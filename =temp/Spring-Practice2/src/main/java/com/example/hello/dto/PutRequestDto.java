package com.example.hello.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;


@Data
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class) //일괄적인 naming 룰
public class PutRequestDto {
    private String name;
    private int age;
    private List<CarDto> carList;
}



