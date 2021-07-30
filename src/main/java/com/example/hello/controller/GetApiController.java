package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    //?key1=value1&key2=value2
    //http://localhost:8080/api/get/query-param?name=codediary18&email=codediary18@gmail.com&age=23
    @GetMapping(path="query-param")
    public String queryParam(@RequestParam Map<String,String> queryParam){
        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry->{
            log.info(entry.getKey());
            log.info(entry.getValue());

            sb.append(entry.getKey()+"="+entry.getValue()+"\n");
        });
        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
                               ){
        log.info(name);
        log.info(email);
        log.info(Integer.toString(age));

        return name+" "+email+" "+age;
    }

    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){
        log.info(userRequest.getName());
        log.info(userRequest.getEmail());
        log.info(Integer.toString(userRequest.getAge()));

        return userRequest.toString();
    }
}
