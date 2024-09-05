package com.pramod.java8.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RefernceTesting {
    public static void main(String [] args){

        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");

           strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) { System.out.println(s);
            } });





        List l1 = Stream.of(1,2,3,4,5)
                .collect(Collectors.toList());

        List l2= l1;

        checklist(l2);

        System.out.println(l1.size());
        System.out.println(l2.size());
    }

    private static void checklist(List l2) {
        List l3=l2;
        l3.add(5);
    }
}
