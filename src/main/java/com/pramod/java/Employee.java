package com.pramod.java;


import lombok.Data;

import java.util.Comparator;

@Data
public class Employee implements Comparator {

    int id;
    String name;

    public Employee(String name, int i) {
        this.name  = name;
        this.id = id;
    }
    public Employee() {
    }

    public Employee(String s) {
    }
//
//    @Override
//    public int compareTo(Object object) {
//        Employee employee = (Employee)object;
//
//        return Integer.compareUnsigned(employee.id, id);
//    }
//
//    @Override
//    public int compareTo(Object object) {
//        Employee employee = (Employee)object;
//
//        return Integer.compareUnsigned(employee.id, id);
//    }

    @Override
    public int compare(Object o1, Object o2) {
        Employee employee1 = (Employee)o1;
        Employee employee = (Employee)o2;
        return employee1.id=employee.id;
    }
}
