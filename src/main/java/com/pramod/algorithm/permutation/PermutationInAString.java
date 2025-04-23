package com.pramod.algorithm.permutation;


import java.util.Arrays;

public class PermutationInAString {
    boolean flag = false;
    public boolean checkInclusion(String s1, String s2) {
       return permutationsofgivenStringUsingSorting(s1,s2,0,s1.length()-1);
    }

    private boolean permutationsofgivenStringUsingSorting(String s1, String s2, int i, int i1) {
        char firstString[] = s1.toCharArray();
        char secondString[] = s2.toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);
        String str1 = new String(firstString);
        String str2 =  new String(secondString);
        return str2.contains(str1);
    }


    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    private void permutationsofgivenStringUsingBruteForce(String str,String s2,int left,int right) {
        if (left == right)
            System.out.println(str);
            if(s2.contains(str)){
                flag = true;
            }

        else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permutationsofgivenStringUsingBruteForce(str, s2,left + 1, right);
                str = swap(str, left, i);
            }
        }
    }
    public static void main(String args[]){
        PermutationInAString ls = new PermutationInAString();
        String s1 = "ab", s2 = "eidboaoo";
        System.out.println(ls.checkInclusion(s1,s2));
    }

}
