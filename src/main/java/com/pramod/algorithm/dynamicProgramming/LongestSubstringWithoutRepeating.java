package com.pramod.algorithm.dynamicProgramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public static void main (String args[]){
       // String  input = "";
      //  String  input = "abcabcbb";
      //  String  input = "bbbbb";

       String  input = "pwwkew";
     //   String  input = "aq";
        int length = lengthOfLongestSubstring(input);
        System.out.println(length);
    }


    public static int lengthOfLongestSubstring(String s) {

        int length = s.length();

        if(s.isBlank()){
            if(length>0){
                return 1;
            }else return 0;
        }
        if(length==1){
            return 1;
        }


        int max=0;

        for(int i=0;i<length;i++){
            Set hs = new HashSet();
            for(int j=i;j<length;j++){
                char  firtChar = s.charAt(j);

                if(hs.contains(firtChar)){
                    break;
                }else{
                    hs.add(firtChar);
                }
            }

            int len= hs.size();
            max =Integer.max(len,max);

        }

        return max;

    }
}
