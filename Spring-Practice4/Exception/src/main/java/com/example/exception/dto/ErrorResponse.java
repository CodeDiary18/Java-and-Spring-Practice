package com.example.exception.dto;

import lombok.Data;

import java.util.List;

@Data
public class ErrorResponse {
    String statusCode;
    String requestUrl;
    String code;
    String message;
    String resultCode;

    List<Error> errorList;
}
