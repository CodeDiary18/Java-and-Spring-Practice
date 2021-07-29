package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //해당 Class는 REST API 처리하는 Controller
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/hello")   //http://localhost:8080/api/hello
    public String hello(){
        return "hello spring boot!";
    }
}
