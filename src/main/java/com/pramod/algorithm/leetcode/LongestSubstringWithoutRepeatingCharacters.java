package com.pramod.algorithm.leetcode;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String args[]) {
        String str = "pwwkew";
        LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();
        int k = ls.lengthOfLongestSubstring(str);
        System.out.print(k);
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int   maxLength =0;
        int length = s.length()-1;

        char [] ch = new char[256];



        int right =0;
        int left =0;

//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//        Example 2:
//
//        Input: s = "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//        Example 3:
//
//        Input: s = "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

        while(right!=length){
            char element = s.charAt(right);
            ch[element]++;

            while(ch[right]>1){
               left++;
            }
         //   maxLength = Math.max(maxLength,right-left+1);
            right ++;

        }
        System.out.println(maxLength);

        return maxLength;
    }

}
