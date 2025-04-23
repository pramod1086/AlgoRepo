package com.pramod.java.java8.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int intArray[] = {1, 2, 3, 4, 1, 11, 2, 1, 12, 11, 7};

        final int len = intArray.length;
        Character c = 'a';


        // Intstream is applicable only for integer values and below code take
        // the lenght of array and start mapping first element to end of array

        IntStream.rangeClosed(1, intArray.length)
                .mapToObj(i -> intArray[intArray.length - i]).forEach(System.out::println);

        int doubleSum = IntStream.rangeClosed(1, 10) .reduce(0,(x,y)-> {
            System.out.printf("multiply", x, y);
            System.out.printf("x=%d, y=%d%n", x, y);
            return x+2*y; });
        System.out.println("the value of List is" + doubleSum);

        // this does sorting and then reverse the array
        List<Integer> ls = Arrays.stream(intArray).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("the value of List is" + ls);

        // this has sorted and printed in actual order
        Arrays.stream(intArray).sorted().forEach(System.out::println);

        // sum of each element of the array
        int data = Arrays.stream(intArray).reduce(0, (a, b) -> a + b);

        System.out.print("the value of int is" + data);

        int sum = IntStream.rangeClosed(1, 10) .reduce((x, y) -> {
            System.out.printf("x=%d, y=%d%n", x, y);
            return x + y; }).orElse(0);

        Integer a = 1000,b = 1000;

        System.out.println(a==b);
        System.out.println(0.1*3 == 0.3);
    }


}
