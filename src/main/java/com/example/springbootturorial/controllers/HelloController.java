package com.example.springbootturorial.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/")
    public String helloWorld() {
        return "Welcome to Pobitra Pradhan fanpage";
    }

}
