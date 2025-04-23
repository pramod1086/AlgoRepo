package com.pramod.algorithm.leetcode;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String args[]) {
        int arr[] = { 1,2,3,5};
        int k = new MissingNumber().missingNumber(arr);
        System.out.print(k);
    }

    private int missingNumber(int[] arr) {

        int xor1 = 0, xor2 = 0;
        int n= arr.length+1;

        // XOR all array elements
        for (int i = 0; i < n - 1; i++) {
            xor2 ^= arr[i];
        }

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // Missing number is the XOR of xor1 and xor2
        return xor1 ^ xor2;


    }
}
