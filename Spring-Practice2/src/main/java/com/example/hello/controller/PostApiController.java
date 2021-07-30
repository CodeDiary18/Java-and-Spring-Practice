package com.example.hello.controller;

import com.example.hello.dto.PostRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api")
public class PostApiController {
    //http://localhost:8080/api/post
    @PostMapping("/post")
    public void post(@RequestBody Map<String,Object> requestData){
        requestData.forEach((key, value) -> {
            log.info("key : " + key);
            log.info("value : " + value);
        });
    }

    //http://localhost:8080/api/post02
    @PostMapping("/post02")
    public void post02(@RequestBody PostRequestDto postRequestDto){
        log.info(postRequestDto.toString());
    }
}
