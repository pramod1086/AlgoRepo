package com.pramod.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumber_17 {

    private static final Map<Character, String> PHONE_MAP = Map.of(
            '2', "abc", '3', "def",
            '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs",
            '8', "tuv", '9', "wxyz"
    );


    public static void main(String args[]) {
       String inputDigit = "23";
        System.out.println(letterCombinations(inputDigit));;
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) return result;
        backtrack(0, digits, new StringBuilder(), result);
        return result;




    }

    private static void backtrack(int index, String digits, StringBuilder stringBuilder, List<String> result) {
        if(index==digits.length()){
            result.add(stringBuilder.toString());
            return;
        }
        String possibleLetters = PHONE_MAP.get(digits.charAt(index));

        for(char ch :possibleLetters.toCharArray()){
            stringBuilder.append(ch);
            backtrack(index+1,digits,stringBuilder,result);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);

        }



    }
}
