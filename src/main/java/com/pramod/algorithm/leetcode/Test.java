package com.pramod.algorithm.leetcode;

import java.util.Arrays;

public class Test {

    public static void main(String args[]) {
       String str = "bbbbb";
        Test test = new Test();
        test.lengthOfLongestSubstring(str);
        test.isAnagram("xx", "x");
    }
    public boolean isAnagram(String s, String t) {

        int len1 = s.length();
        int len2 = s.length();

        if(len1 != len2) {
            return false;
        }
        char[] charArray = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray2);

        for(int i = 0; i < len1; i++) {

            if(charArray[i] != charArray2[i]) {
                return false;
            }
        }
        return true;


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
