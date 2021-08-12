package com.example.hello.controller;

import com.example.hello.dto.PutRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class PutApiController {

    //http://localhost:8080/api/put
    @PutMapping("/put")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto){
        log.info(putRequestDto.toString());
        return putRequestDto;   //json 형태로 데이터 내려줌
    }

    //http://localhost:8080/api/put02/
    @PutMapping("/put02/{userId}")
    public PutRequestDto put02(@RequestBody PutRequestDto putRequestDto, @PathVariable(name="userId") Long id){
        log.info("userId : "+Long.toString(id));
        log.info(putRequestDto.toString());
        return putRequestDto;   //json 형태로 데이터 내려줌
    }
}
