package com.pramod.algorithm.anagram;


import java.util.HashMap;
import java.util.Map;

public class AnaGramUsingMap {
    public static void main(String args []){

        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";

        // Function call
        if (isAnagram(str1, str2))
            System.out.print("The two strings are "
                    + "anagram of each other");


    }

    private static boolean isAnagram(String str1, String str2) {

        Map firstString = new HashMap();
      //  Map secondString = new HashMap();
        Boolean isAnagram = false;
        for(int i = 0;i<str1.length();i++){
            char ch = str1.charAt(i);
            int count = (int) firstString.getOrDefault(ch, 0);
            firstString.put(ch,count+1);
        }
        for(int i = 0;i<str2.length();i++){
            char ch = str2.charAt(i);
            int count = (int) firstString.getOrDefault(ch, 0);
            firstString.put(ch,count-1);
        }
        return isAnagram;




    }
}
