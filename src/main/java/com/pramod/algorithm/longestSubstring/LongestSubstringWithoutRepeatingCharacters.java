package com.pramod.algorithm.longestSubstring;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    // Driver code
    public static void main(String[] args)
    {
        String str = "pwwkew";
        System.out.println("The input string is " + str);

        int len = longestUniqueSubstt(str);
        System.out.println("The length of the longest "
                + "non-repeating character "
                + "substring is " + len);

        System.out.println("The length of the longest "
                + "non-repeating character "
                + "substring is " + longestUniqueUsinSet("au"));
    }

    private static int longestUniqueUsinSet(String s) {
//        Char[] ch = s.toCharArray()

        int maxLenght =0;

        int length = s.length();

        for(int i=0;i<length;i++){
            HashSet set = new HashSet();
            int count = 0;
            for(int j=i;j<length;j++){
                if(set.contains(s.charAt(j))){
                    break;
                }else {
                    set.add(s.charAt(j));
                }
            }
            maxLenght = Math.max(maxLenght,set.size());
        }


        return maxLenght;
    }

        private static int longestUniqueSubstt(String s) {

            int maxLenght =0;

            int length = s.length();
             boolean arr[] = new boolean[256];

            for(int i=0;i<length;i++){
                for(int j=i;j<length;j++){

                    if(arr[s.charAt(j)]==true){
                        break;
                    }else {
                        maxLenght = Math.max(maxLenght,j-i+1);
                        arr[s.charAt(j)]=true;
                    }
                }
            }




            return maxLenght;
        }
    private static int longestUniqueSubsttr(String s) {
        int   maxLength =0;
        int length = s.length();
        if(length==0){
            return length;
        }
        if(length==1){
            return length;
        }

        char [] ch = new char[256];

        //int right = 0;
        int left = 0;

        for (int right = 0; right < length; right++) {
            char element = s.charAt(right);
            if(ch[element]>=1){
                ch[element]++;
                left ++;
            }else{
                ch[element]++;
            }
            left = Math.max(left, right + 1);
            ch[element]++;
            maxLength = Math.max(maxLength,right-left+1);

        }
        System.out.println(maxLength);

        return maxLength;
    }

}
