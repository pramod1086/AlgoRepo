package com.pramod.algorithm.leetcode;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseInteger_7 {
    public static void main(String args[]) {

        System.out.print(new ReverseInteger_7().reverse(123));
    }
    public int reverse(int x) {

     boolean isNegative = x < 0;

       String str = Integer.toString(Math.abs(x))
                .chars() // IntStream of ASCII values
               .mapToObj(c -> String.valueOf((char) c))
                       .collect(Collectors.joining()).toString();
        try{
            String result = new StringBuilder(str).reverse().toString();
            int reversed = Integer.parseInt(result);
            if(reversed>Integer.MAX_VALUE || reversed<Integer.MIN_VALUE){
                return 0;
            }

            return isNegative ? -reversed : reversed;
        }catch (NumberFormatException e) {
            return 0; // Just in case, fallback
        }



    }
}
