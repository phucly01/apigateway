package com.microservices.apigateway.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInterfacingController {
    

    @GetMapping("/")
    public String home()
    {
        return "I am Home";
    }
}
