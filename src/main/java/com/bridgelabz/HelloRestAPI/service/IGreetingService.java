package com.bridgelabz.HelloRestAPI.service;

import com.bridgelabz.HelloRestAPI.model.Greeting;
import com.bridgelabz.HelloRestAPI.model.Users;


public interface IGreetingService {
    Greeting addGreeting(Users users);
    Greeting addGreetingById(long id);

}
