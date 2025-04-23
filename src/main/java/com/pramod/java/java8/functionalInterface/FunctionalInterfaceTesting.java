package com.pramod.java.java8.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfaceTesting {
    public static void main(String args[]){

        List<String> names = Arrays.asList("Mal", "Wash", "Kaylee", "Inara",
                "Zoë", "Jayne", "Simon", "River", "Shepherd Book");
        List<Integer> nameLengths = names.stream().map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) { return s.length();
                    } })
                .collect(Collectors.toList());

        Consumer cs = (test)->{
            System.out.println("We are inside consumer testing");
            System.out.println(test);
        };

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("We are inside second consumer testing");
                System.out.println(s);
            } });



        names.forEach(( s) ->{
                System.out.println("We are inside second consumer testing");
                System.out.println(s);
            } );


        nameLengths= names.stream().map(test->test.length()).collect(Collectors.toList());
        nameLengths= names.stream().map(String::length).collect(Collectors.toList());

        System.out.printf("nameLengths = %s%n", nameLengths);

        Function<String, Integer> func = x -> x.length();

        Function<Integer, Integer> func2 = x -> x * 2;

        Integer result = func.andThen(func2).apply("mkyong");   // 12

        System.out.println(result);
        addTwo(1, 2, (x, y) -> System.out.println(x + y));          // 3
        addTwo("Node", ".js", (x, y) -> System.out.println(x + y)); // Node.js

    }

     static <T> void addTwo(T a1, T a2, BiConsumer<T, T> c) {
        c.accept(a1, a2);
    }
    static <T> int test(String str) {
      return str.length();
    }
}
