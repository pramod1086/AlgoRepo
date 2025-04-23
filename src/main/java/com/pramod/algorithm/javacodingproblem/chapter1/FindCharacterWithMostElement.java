package com.pramod.algorithm.javacodingproblem.chapter1;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindCharacterWithMostElement {
    public static void main(String args[]){
        String str = "aababcaab";

       System.out.println(findMaxNumberOfOccurances(str)); ;
    }

    private static Optional<Map.Entry<Character,  Long>> findMaxNumberOfOccurances(String str) {

       return str.chars().filter(character->Character.isWhitespace(character)==false)
                .mapToObj(invValue->(char) invValue)
                .collect(Collectors.groupingBy(character->character,Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

    }
}
