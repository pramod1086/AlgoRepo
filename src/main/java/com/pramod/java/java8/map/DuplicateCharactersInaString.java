package com.pramod.java.java8.map;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharactersInaString {
    public static void main(String args[]) {

        String str = "abcabcabcd";

       Map<Character, Long> ms = str.chars().mapToObj(ch ->(char)ch).collect(Collectors.groupingBy(character -> character,Collectors.counting()));
      //  Map<Character, Long> mst = str.chars().collect(Collectors.groupingBy(character->character,Collectors.counting()));

        ms.entrySet().forEach(System.out::println);

    }
}
