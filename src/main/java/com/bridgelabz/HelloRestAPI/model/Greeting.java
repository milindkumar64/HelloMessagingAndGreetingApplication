package com.bridgelabz.HelloRestAPI.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data // = getter + setter + ToString
@Table(name="GREETING_USER")
@AllArgsConstructor
public class Greeting {

    @Id
    private final long id;
    private final String message;


}
