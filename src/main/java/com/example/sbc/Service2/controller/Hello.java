package com.example.sbc.Service2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/hello/service")
    public String HelloWord(){
        return "Hello";
    }
}
