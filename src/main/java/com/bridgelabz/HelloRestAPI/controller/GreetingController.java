package com.bridgelabz.HelloRestAPI.controller;

import com.bridgelabz.HelloRestAPI.model.Greeting;
import com.bridgelabz.HelloRestAPI.model.Users;
import com.bridgelabz.HelloRestAPI.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

     static final String template = "Hello,%s";
     final AtomicLong counter = new AtomicLong();
     //UC1
    @PostMapping("/testJson")
    public Greeting testJson(@RequestBody Greeting greeting){
        return greeting;
    }

    @Autowired
    private IGreetingService service;

    public GreetingController(IGreetingService service) {
        this.service = service;
    }

    //UC2
    @GetMapping("/greeting")
    public Greeting greeting1(@RequestParam(value = "name", defaultValue = "World!") String name){
        return new Greeting(counter.incrementAndGet(),String.format(template, name));
    }
}
