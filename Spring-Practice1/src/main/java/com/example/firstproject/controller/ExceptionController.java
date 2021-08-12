package com.example.firstproject.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// Spring Boot 전역 에러 처리 - https://springboot.tistory.com/25
// Exception Handling in Spring MVC - https://luvstudy.tistory.com/74
@ControllerAdvice("com.example.firstproject.controller") // 해당 패키지 내 모든 에러를 처리!
public class ExceptionController {
    @ExceptionHandler(IllegalArgumentException.class) // 해당 예외 발생 시, 수행!
    public String notFound(Exception exception, Model model) {
        model.addAttribute("exception", exception);
        return "errors/404-error"; // 해당 페이지를 보여 줌!
    }
}