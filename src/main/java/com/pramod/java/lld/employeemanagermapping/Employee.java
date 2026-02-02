package com.pramod.java.lld.employeemanagermapping;


//[
//        {"id":"1","name":"Alice","managerId":null},
//        {"id":"2","name":"Bob","managerId":"1"},
//        {"id":"3","name":"Charlie","managerId":"1"},
//        {"id":"4","name":"David","managerId":"2"},
//        {"id":"5","name":"Eve","managerId":"2"},
//        {"id":"6","name":"Zara","managerId":null},
//        {"id":"7","name":"Oscar","managerId":"6"},
//        {"id":"6","name":"Zara","managerId":"7"}
//        ]

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {

    int id;
    String name;
    int age;
    int salary;
    Integer managerId;

    public Employee(int id, String name, int age, int salary, Integer managerId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.managerId = managerId;
    }
}
