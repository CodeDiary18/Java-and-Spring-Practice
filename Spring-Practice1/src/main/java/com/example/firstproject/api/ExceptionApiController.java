package com.example.firstproject.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice("com.example.firstproject.api")
public class ExceptionApiController {
    @ResponseBody // 뷰 페이지 없이, 반환 값을 그대로 응답!
    @ResponseStatus(HttpStatus.NOT_FOUND) // HTTP 상태 응답 설정, 404 not found!
    @ExceptionHandler(IllegalArgumentException.class) // 해당 예외 발생 시, 수행!
    public String notFound(Exception exception) {
        return "{}"; // 비어있는 JSON 객체 반환!
    }
}
