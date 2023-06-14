package com.bridgelabz.HelloRestAPI.repository;

import com.bridgelabz.HelloRestAPI.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepo extends JpaRepository<Greeting,Long> {
}
