package com.example.secondservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/micro2")
public class SecondController {

    @GetMapping("/print")
    public String printHello() {
        return "Hello from service 2";
    }
}
