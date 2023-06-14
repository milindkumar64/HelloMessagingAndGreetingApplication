package com.bridgelabz.HelloRestAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data // = getter + setter + ToString
public class User {

    @Id
    private String firstName;
    private String lastName;
}
