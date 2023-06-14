package com.bridgelabz.HelloRestAPI.model;


public class Person {

    String fName;
    String lName;

    public Person() {
    }

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}

