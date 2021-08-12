package com.example.hello.controller;

import com.example.hello.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //html파일 return하는 controller
public class PageController {
    @RequestMapping("/main")        //http://localhost:8080/main
    public String main(){
        return "main.html";
    }

    //ResponseEntity
    @ResponseBody   //RestController가 아닌 곳(Controller)에서 응답을 내릴 때
    @GetMapping("/user")
    public User user(){         //http://localhost:8080/user
        var user = new User();
        user.setName("codediary18");
        user.setAddress("패캠");
        return user;
    }
}
