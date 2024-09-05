package com.pramod.geekforGeeks;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceUsingIteration {
    public static void main(String[] args) {

        String word = "ABC";
        char[] words = word.toCharArray();
        List<String> results = new ArrayList<String>();
        for ( int i = 1; i <= (1<<(words.length))-1; i++ ) {
            StringBuilder builder = new StringBuilder();
            for ( int j = 0; j < words.length; j++ ) {
                if ( (i & (1<<j)) != 0) {
                    builder.append(words[j]);
                }
            }
            results.add(builder.toString());
        }
        System.out.println( results );
    }
}
