package com.pramod.java.comparatorandcomparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Testing {
    public static void main(String args[]){
        Employee es = new Employee();
        es.setId(1);
        Employee es1 = new Employee();
        Employee es2 = new Employee();
        es1.setId(2);
        es2.setId(3);
        List ls = List.of(es,es1,es2);

      //  Arrays.sort(ls.toArray());
        Collections.sort(ls);
        ls.forEach(element->System.out.println(element));


    }
}
