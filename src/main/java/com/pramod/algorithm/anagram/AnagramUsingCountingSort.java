package com.pramod.algorithm.anagram;
import java.util.Arrays;

public class AnagramUsingCountingSort {

    public static void main(String args []){

        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";

        // Function call
        if (isAnagram(str1, str2))
            System.out.print("The two strings are "
                    + "anagram of each other");
        

    }

    private static boolean isAnagram(String str1, String str2) {
         int NO_OF_CHARS = 256;
        Boolean isAnagram = false;
        int firstArray[] = new int[NO_OF_CHARS];
        Arrays.fill(firstArray, 0);
        int SecondArray[] = new int[NO_OF_CHARS];
        Arrays.fill(SecondArray, 0);


        return isAnagram;

    }
}
