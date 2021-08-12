package com.example.hello.controller;

import com.example.hello.dto.User;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //해당 Class는 REST API 처리하는 Controller
@RequestMapping("/api")
@JsonNaming()
public class ApiController {
    @GetMapping("/hello")   //http://localhost:8080/api/hello
    public String hello(){
        return "hello spring boot!";
    }

    //TEXT
    @GetMapping("/text")    //http://localhost:8080/api/text
    public String text(@RequestParam String account){
        return account;
    }

    //JSON
    // req -> object mapper -> object -> method -> object -> object mapper -> json ->response
    @PostMapping("/json")   //http://localhost:8080/api/json
    public User json(@RequestBody User user){
        return user;    //200 OK
    }

    //ResponseEntity
    @PutMapping("/put03")     //http://localhost:8080/api/put03
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
