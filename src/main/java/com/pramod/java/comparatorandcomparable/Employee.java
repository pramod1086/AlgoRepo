package com.pramod.java.comparatorandcomparable;


import lombok.Data;

import java.util.Comparator;

@Data
public class Employee implements Comparator {

    int id;
    String name;
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
