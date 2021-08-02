package com.example.validation.dto;

import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
public class User {
    @NotBlank
    private String name;

    @Min(value = 1)
    @Max(value = 100)
    private int age;

    @Email
    private String email;

    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 번호의 양식과 맞지 않습니다. 01x-xxx(x)-xxxx") //핸드폰 정규식
    private String phoneNumber;

    @Size(min = 6, max = 6)
    private String reqYearMonth;    //yyyyMM

    @AssertTrue(message="yyyyMM의 형식에 맞지 않습니다.")
    public boolean isReqYearMonthValidation() { //앞에 is 붙여야 함
        try{
            LocalDate localDate = LocalDate.parse(getReqYearMonth()+"01", DateTimeFormatter.ofPattern("yyyyMMdd"));
        }catch (Exception e){
            return false;
        }
        return true;
    }
}