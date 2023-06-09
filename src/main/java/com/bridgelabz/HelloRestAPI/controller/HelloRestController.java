package com.bridgelabz.HelloRestAPI.controller;

import com.bridgelabz.HelloRestAPI.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    //UC-1
    @GetMapping(value = "/hello")
    public String helloBridgelabz(){
        return "Hello from Bridgelabz !";
    }

    //UC-2
    @GetMapping(value = "/param")
    public String param(@RequestParam String name){
        return "Hello "+name;
    }

}
