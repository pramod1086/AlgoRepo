package com.pramod.algorithm.leetcode;

import java.util.Arrays;

public class Test {

    public static void main(String args[]) {
       String str = "bbbbb";
        Test test = new Test();
        test.lengthOfLongestSubstring(str);
    }
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int   maxLength =0;
        int len = s.length();
        if(len<=1){
            return len;
        }

        for(int i=0;i<len-2;i++){
            int current = 0;

            while(current<=i){
                char currentChar = s.charAt(current);
                char nextChar = s.charAt(current+1);

                if(Character.compare(currentChar, nextChar) < 0){
                    current++;
                }else{
                    break;
                }
            }
            int lenght = i-current+1;


             maxLength = Math.max(maxLength, i - current + 1);

            if(lenght>max){
                max = lenght;
            }


        }
        System.out.println(maxLength);
        return max;

    }

}
