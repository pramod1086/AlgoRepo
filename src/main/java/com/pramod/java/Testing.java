package com.pramod.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String args[]){
        Employee es = new Employee();
        es.setId(1);
        Employee es1 = new Employee();
        Employee es2 = new Employee();
        es1.setId(2);
        es2.setId(3);
        List ls = List.of(es,es1,es2);

//      //  Arrays.sort(ls.toArray());
//        Collections.sort(ls);
//        ls.forEach(element->System.out.println(element));

        List<String> names =
                Arrays.asList("Grace Hopper", "Barbara Liskov", "Ada Lovelace",
                        "Karen Spärck Jones");
        List<Employee> people = names.stream()
                .map(name -> new Employee(name,123))
                .collect(Collectors.toList());

        names.stream().map(Employee::new).collect(Collectors.toList());


    }
}
