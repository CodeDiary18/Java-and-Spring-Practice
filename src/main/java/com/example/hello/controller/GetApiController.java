package com.example.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/get")
public class GetApiController {
    @GetMapping("/hello")       //http://localhost:8080/api/get/hello
    public String getHello(){
        return "get Hello";
    }
    
    
    @RequestMapping(path = "/hi",method = RequestMethod.GET)        //http://localhost:8080/api/get/hi
    public String hi(){ //이전에 사용하던 방식 요즘은 GetMapping사용
        return "hi";
    }

    //http://localhost:8080/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable String name){
        log.info("PathVariable : "+name);
        return name;
    }

    @GetMapping("path-variable2/{id}")
    public String pathVariable2(@PathVariable(name="id") String pathName){
        log.info("PathVariable2 : "+pathName);
        return pathName;
    }
}
