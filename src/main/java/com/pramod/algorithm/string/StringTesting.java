package com.pramod.algorithm.string;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StringTesting {
    public static void main(String[] args) {
        String [] str = {"4PGC938","2IYE230","3CIO720","1ICK750","1OHV845"};
        Set<String> s = new TreeSet<>();
        Collections.addAll(s, str);

        String sub = "aababcaab".substring(0,0+3);
        System.out.println(sub);


//        String str1 = "PRamod";
//        String str2 = "PRa";
//        System.out.println(str1.contains(str2));
//        System.out.println(str1.indexOf(str2));

        String str1 = "";
        String str2 = str1;
        String str3 = str1+ "";
        String str4 = new String("");
        String str5 = str1 + str2;
        System.out.println(str1 == str2);  ////  true
        System.out.println(str1 == str2);/// true
        System.out.println(str1 == str3);  //false
        System.out.println(str1 == str4);//false
        System.out.println(str1 == str5);//false
        System.out.println(str3 == str5);///false
        System.out.println(s);

        String input = "aababcaab";
        input.chars().mapToObj(ch->(char)ch).collect(Collectors.toSet()).forEach(System.out::println);
        input.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toCollection(HashSet::new)).forEach(System.out::println);
    }
}
