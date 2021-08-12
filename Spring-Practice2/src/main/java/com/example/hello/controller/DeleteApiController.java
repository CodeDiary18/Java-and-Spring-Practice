package com.example.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class DeleteApiController {
    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account){
        log.info(userId);
        log.info(account);
    }
}
