package com.pramod.algorithm.longestSubsequence;

public class LongestCommonSubSequence {
    public static void main (String args[]){
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] firstArray=s1.toCharArray();
        char[] secondArray=s2.toCharArray();
        int m = firstArray.length;
        int n = secondArray.length;

        int length = getLongestCommonSubSequence(firstArray,secondArray,m,n);
        System.out.println(length);
    }

    private static int getLongestCommonSubSequence(char[] firstArray, char[] secondArray, int m, int n) {
        if(m==0||n==0){
            return 0;
        }
        if(firstArray[m-1]==secondArray[n-1]){
            return 1+getLongestCommonSubSequence(firstArray,secondArray,m-1,n-1);
        }else {
            return Integer.max(getLongestCommonSubSequence(firstArray,secondArray,m-1,n),getLongestCommonSubSequence(firstArray,secondArray,m,n-1));
        }
    }
}
