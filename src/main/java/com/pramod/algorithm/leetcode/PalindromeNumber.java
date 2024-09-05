package com.pramod.algorithm.leetcode;

public class PalindromeNumber {
    public static void main(String args[])
    {
        int x = -121;
        PalindromeNumber ps = new PalindromeNumber();
        System.out.println(ps.isPalindrome(x));
    }
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int length = str.length();

        int endIndex = length-1;
        if(length%2==0){
            int middle = length/2;
            int middleMinus = middle-1;
            for(int i=0,j = endIndex;i<=middleMinus;i++,j--){
                if(str.charAt(i)!=str.charAt(j)){
                    return false;
                }
            }


        }else {
            int middle = endIndex/2;
            for(int i=0,j = endIndex;i<=middle;i++,j--){
                if(str.charAt(i)!=str.charAt(j)){
                    return false;
                }
            }
        }


        return true;
    }
}
