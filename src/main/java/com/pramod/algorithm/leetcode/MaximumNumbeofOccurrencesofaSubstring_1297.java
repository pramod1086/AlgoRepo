package com.pramod.algorithm.leetcode;

import java.util.*;

public class MaximumNumbeofOccurrencesofaSubstring_1297 {

    public static void main(String args[]) {
        String s = "aaaaacbc"; int maxLetters = 2, minSize = 3, maxSize = 4;
        System.out.println(new MaximumNumbeofOccurrencesofaSubstring_1297().maxFreq(s,maxLetters,minSize,minSize));
    }


    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {

        int len =s.length();
        Map<String,Integer> hs = new HashMap();

        for(int i =0;i<=len-minSize;i++){
            String sub = s.substring(i,i+minSize);

            if(isValid(sub,maxLetters)){
                hs.put(sub,hs.getOrDefault(sub,0)+1);
            }

        }
        return hs.values().stream()
                .max(Integer::compareTo)
                .orElse(0);



    }

    private boolean isValid(String subString, int maxLetters) {

        Set hs = new HashSet();
        for (char c : subString.toCharArray()) {
            hs.add(c);

        }



        return hs.size()==maxLetters;





    }
}
