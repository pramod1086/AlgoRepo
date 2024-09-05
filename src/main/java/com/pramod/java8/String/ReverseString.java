package com.pramod.java8.String;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String[] ar = {"I", "am", "pramod", "aka"};

        IntStream.rangeClosed(1, ar.length)
                .mapToObj(i -> ar[ar.length - i]).forEach(System.out::println);
        System.out.println("ends");


        /// simple and elegent solution
        String s = Arrays.stream(ar).reduce("", (a, b) -> b + " " + a);


        System.out.println("elegent solution reversed String s " + " " + s);
        Optional<String> str2 = Arrays.stream(ar).reduce((a, b) -> b + " " + a
        );

        System.out.println("optional second reversed String is " + str2.get());

        Optional<String> str1 = Arrays.stream(ar).reduce((a, b) -> {
            String x = b + " " + a;
            return x;

        });
        System.out.println("optional third reversed String is " + str1.get());

        System.out.println("end of simple solutioon");
///

//
//        String reverseUsingCollect = Stream.of("this", "is", "a", "list").
//                collect(() -> new StringBuilder(),
//                        (sb, str) -> sb.append(str),
//                        (sb2, sb1) -> sb1.append(sb2)).toString();
//
//        System.out.println("reversed String is " + " " + reverseUsingCollect);


        //Another Way fo reversing String using method referce

        String reverseUsingMethodReferece = Stream.of("this", "is", "a", "list").
                reduce("",ReverseString::getReverse);
        System.out.println("reversed Strin using reverseUsingMethodReferece " + " " + reverseUsingMethodReferece );
    }

    private static String getReverse(String s1, String s2) {
        return s2+" "+s1;
    }


}
