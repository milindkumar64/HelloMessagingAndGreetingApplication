package com.bridgelabz.HelloRestAPI.controller;

import com.bridgelabz.HelloRestAPI.model.Greeting;
import com.bridgelabz.HelloRestAPI.model.Users;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @PostMapping("/testJson")
    public Greeting testJson(@RequestBody Greeting greeting){
        return greeting;
    }
}
