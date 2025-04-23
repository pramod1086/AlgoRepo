package com.pramod.java.designpattern.builder;
import lombok.ToString;
@ToString
public class User {
    private  String firstName; // Required
    private  String lastName;  // Required
    private  int age;          // Optional


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
