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

    //UC-3
    @GetMapping(value = "/path/{name}")
    public String path(@PathVariable String name){
        return "Hello "+name;
    }
    //UC-4
    @PostMapping(value = "/add-person")
    public String addPerson(@RequestBody Person person){
        return "Hello "+person.getfName()+"..."+person.getlName();
    }

    //UC5
    //http://localhost:8082/put-method/Milind?lName=Gupta
    //plz write { } in body of postman
    @PutMapping(value = "/put-method/{fName}")
    public String putMap(@PathVariable String fName, @RequestParam String lName ,@RequestBody Person updatedperson){

        updatedperson.setfName(fName);
        updatedperson.setlName(lName);
        return "Hello "+ updatedperson.getfName()+".."+updatedperson.getlName();
    }
}
