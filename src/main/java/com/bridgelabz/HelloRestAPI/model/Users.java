package com.bridgelabz.HelloRestAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data // = getter + setter + ToString
public class Users {

    @Id
    private String firstName;
    private String lastName;
}
