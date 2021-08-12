package com.example.aop.controller;

import com.example.aop.annotation.Decode;
import com.example.aop.annotation.Timer;
import com.example.aop.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name) {
        log.info("----> get method : " + id + ", " + name);
        return id + " " + name;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user) {
        log.info("----> post method : " + user.toString());
        return user;
    }

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {
/*
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
*/

        //db logic
        Thread.sleep(1000 * 2);

/*
        stopWatch.stop();
        System.out.println("total time : "+stopWatch.getTotalTimeSeconds());
*/
    }

    @Decode
    @PutMapping("/put")
    public User put(@RequestBody User user){
        System.out.println("put");
        System.out.println(user);
        return user;
    }
}
