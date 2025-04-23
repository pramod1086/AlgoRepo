package com.pramod.algorithm.string;

import java.util.Arrays;

public class KMPStringSearch {

    // Function to implement KMP algorithm
    public static void KMPSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        // Compute the LPS array
        int[] lps = computeLPSArray(pattern, m);
        System.out.println(Arrays.toString(lps));


        int i = 0; // Pointer for text
        int j = 0; // Pointer for pattern
      //  Text:    ABABABAABABABC
     //   Pattern: ABABAC
        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1]; // Back up the pattern pointer
            } else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1]; // Back up using LPS
                } else {
                    i++;
                }
            }
        }
    }

    // Function to compute the LPS array
    private static int[] computeLPSArray(String pattern, int m) {
        int[] lps = new int[m];
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; // Back up LPS pointer
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String text = "ABABACCABABABC";
       // String text = "ABABABCABABABC";

       // String pattern = "ABABA";
        // String pattern = "AABAACAABAA";
        String pattern = "AAACAAAA";


        KMPSearch(text, pattern);
    }
}