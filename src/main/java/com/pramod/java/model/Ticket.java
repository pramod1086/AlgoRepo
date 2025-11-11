package com.pramod.java.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Ticket {

    int priority;
    String status;
    int age;

}
