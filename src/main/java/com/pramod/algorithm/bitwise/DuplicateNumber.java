package com.pramod.algorithm.bitwise;

public class DuplicateNumber {

    public static void main(String[] args) throws
            java.lang.Exception
    {
        int[] arr = {1, 5, 1, 10, 12, 10};
        checkDuplicateNumber(arr);
    }

    private static void checkDuplicateNumber(int[] arr) {

        int[] array =  new int[(320000>>5) + 1];
// Traverse array elements
        for (int i=0; i<arr.length; i++) {
            // Index in bit array
            int num = arr[i] - 1;
        }
    }
}
