package com.pramod.algorithm.bitwise;

public class SwapTwoNumbers {
    public static void main(String[] args)
    {
        swap(10,20);
    }
    public static void swap(int a, int b) {
        //// bitwise XOR of 2 numbers returns a number that has those bits set,
        // which are unset in one of the numbers and set in the other number.
        // Using this number, if XOR it with our original numbers in reverse order,
        // we will be able to recover back our original numbers,
        // but now in swapped condition.
        System.out.println("Before Swapping:");
        System.out.println(a + " " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("After Swapping:");
        System.out.println(a + " " + b);
    }
}
