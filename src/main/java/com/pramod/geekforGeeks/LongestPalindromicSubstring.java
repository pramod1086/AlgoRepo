package com.pramod.geekforGeeks;

public class LongestPalindromicSubstring {


    public String longestPalindrome(String s) {
        String result = "";
        int palindromlenght =0;
        int length = s.length();

        for(int i=0;i<length;i++){
         int left=i;
            int right =i;
             while(left>=0 && right < length && s.charAt(left)==s.charAt(right)&& (i-left==right-i)){

                if(right-left+1 > palindromlenght){
                    result= s.substring(left,right+1);
                    palindromlenght = right-left+1;
                }
                left =left-1;
                if(right<length-1){
                    right = right+1;
                }

            }
            int leftven = i;
            int righteven  =i+1;

            while(leftven>=0 && righteven < length && s.charAt(leftven)==s.charAt(righteven)){

                if(righteven-leftven    +1 > palindromlenght){
                    result= s.substring(leftven,righteven+1);
                    palindromlenght = righteven-leftven+1;
                }
                leftven--;
                righteven++;

            }

        }

        return result;

    }

    public static void main(String args[]){
        LongestPalindromicSubstring ls = new LongestPalindromicSubstring();
       System.out.println(ls.longestPalindrome("SQQSYYSQQS"));

    }
}
