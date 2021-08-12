package com.example.interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class PublicController { //아무런 권한이 없는 사용자가 모두 들어올 수 있는 곳

    @GetMapping("/hello")
    public String hello(){
        return "public hello";
    }

}
