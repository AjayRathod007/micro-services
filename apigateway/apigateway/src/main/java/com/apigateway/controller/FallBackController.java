package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallback(){
        return "user service is down at this time !!";
    }

    @GetMapping("/userServiceFallback")
    public String contactServiceFallback(){
        return "contact service is down at this time !!";
    }
}
