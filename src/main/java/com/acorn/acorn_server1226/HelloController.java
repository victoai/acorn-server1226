package com.acorn.acorn_server1226;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    @GetMapping("/hi")
    public  String hi(){

        return "hello  코드 수정";
    }
}
