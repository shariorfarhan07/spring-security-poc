package com.springsecurity.SpringSecEx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String publicPage(){
        return "this is public farhan";
    }

    @GetMapping("/private")
    public String privatePage(){
        return "this is private farhan";
    }
    
}
