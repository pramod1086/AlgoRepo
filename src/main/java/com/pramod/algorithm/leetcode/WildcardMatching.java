package com.pramod.algorithm.leetcode;

public class WildcardMatching {
    public static void main(String args[]){
       String input  = "aa", pattern = "a";
        System.out.println(new WildcardMatching().isMatch(input,pattern));


    }
    public boolean isMatch(String s, String p) {

        int stringLen = s.length();
        int patternLen = p.length();
        int i=0;
        int j=0;

        while(i<stringLen && j<patternLen){
            int stringChar = s.charAt(i);
            int patternChar = p.charAt(j);


            if(stringChar==patternChar){
                if(patternChar=='*'){
                    i++;
                }else {
                    i++;
                    j++;

                }
            }else{
                return false;
            }
        }




                return true;


    }
}
