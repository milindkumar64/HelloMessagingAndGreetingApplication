package com.bridgelabz.HelloRestAPI.service;

import com.bridgelabz.HelloRestAPI.model.Greeting;
import com.bridgelabz.HelloRestAPI.model.Users;
import com.bridgelabz.HelloRestAPI.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
@Service
public  class GreetingService implements IGreetingService {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();




    @Autowired
    private GreetingRepo greetingRepository;

    public GreetingService(GreetingRepo greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public Greeting addGreeting(Users users) {
     String message = String.format(template,(users.toString().isEmpty() ? "Hello World" : users.toString()));
     System.out.println(greetingRepository);
        return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
    }
    @Override
    public Greeting addGreetingById(long id) {
        return null;
    }
}
