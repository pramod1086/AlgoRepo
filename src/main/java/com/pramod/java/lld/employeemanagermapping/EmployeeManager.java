package com.pramod.java.lld.employeemanagermapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeManager {
    public static void main(String args[]) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 30, 100000, null));
        employees.add(new Employee(2, "Jane", 25, 90000, 1));
        employees.add(new Employee(3, "Jim", 35, 120000, 1));
        employees.add(new Employee(4, "Jill", 32, 110000, 2));
        employees.add(new Employee(5, "Jack", 33, 130000, 2));
        employees.add(new Employee(6, "Jill", 34, 140000, 3));
        employees.add(new Employee(7, "Jill", 35, 150000, 3));
        employees.add(new Employee(8, "Jill", 36, 160000, 4));
        employees.add(new Employee(9, "Jill", 37, 170000, 4));
        System.out.println(new EmployeeManager().managerMapping(employees));
    }

    public static  Map<Integer, List<Employee>>managerMapping(List<Employee> employees) {
        Map<Integer, List<Employee>> managerMap = new HashMap<>();
        for (Employee employee : employees) {
            managerMap
                .computeIfAbsent(employee.getManagerId(), key -> new ArrayList<>())
                .add(employee);


        }

        Map<Integer, List<Employee>> ms = employees.stream()
                // Streams groupingBy does not accept null keys, so map null managerId to a placeholder
                .collect(Collectors.groupingBy(e -> Objects.requireNonNullElse(e.getManagerId(), -1),
                        Collectors.toList()));


//        Integer managerId = employee.getManagerId();
//        List<Employee> list = managerMap.get(managerId);
//        if (list == null) {
//            list = new ArrayList<>();
//            managerMap.put(managerId, list);
//        }
//        list.add(employee);
//    }

        return managerMap;
    }
}
