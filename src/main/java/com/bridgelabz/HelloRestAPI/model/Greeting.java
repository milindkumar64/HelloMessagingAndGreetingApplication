package com.bridgelabz.HelloRestAPI.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data // = getter + setter + ToString
@Table(name="GREETING_USER")
@AllArgsConstructor
public class Greeting {

    @Id
    //@GeneratedValue
    @Column(name = "message-Id")
    private final long id;
    @Column(name = "Greeting_message")
    private final String message;

    public Greeting(){
        id=0;
        message="";
    }
}
