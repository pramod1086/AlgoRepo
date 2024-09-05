package com.pramod.algorithm.dynamicProgramming;

public class LongestPalindromicSubstringClean {
    // This function prints the
    // longest palindrome substring
    // (LPS) of str[]. It also
    // returns the length of the
    // longest palindrome
    static int maxLength; // variables to store and
    static String res; // update  maxLength and res

    // A utility function to get the longest palindrome
    // starting and expanding out from given center indices
    static void cSubUtil(String s, int l, int r)
    {
        // check if the indices lie in the range of string
        // and also if it is palindrome
        while (l >= 0 && r < s.length()
                && s.charAt(l) == s.charAt(r)) {
            // expand the boundary
            l--;
            r++;
        }
        // if it's length is greater than maxLength update
        // maxLength and res
        if (r - l - 1 >= maxLength) {
            res = s.substring(l + 1, r);
            maxLength = r - l - 1;
        }
        return;
    }
    // A function which takes a string prints the LPS and
    // returns the length of LPS
    static int longestPalSubstr(String str)
    {
        res = "";
        maxLength = 1;
        // for every index in the string check palindromes
        // starting from that index
        for (int i = 0; i < str.length(); i++) {
            // check for odd length palindromes
            cSubUtil(str, i, i);
            // check for even length palindromes
            cSubUtil(str, i, i + 1);
        }
        System.out.print(
                "Longest palindrome substring is: ");
        System.out.println(res);
        return maxLength;
    }

    // Driver program to test above function
    public static void main(String[] args)
    {

        String str = "forgeeksskeegfor";
        System.out.println("Length is: "
                + longestPalSubstr(str));
    }
}
