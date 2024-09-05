package com.pramod.algorithm.leetcode;

public class SumofTwoIntegers {
    public static void main(String args[])
    {
        System.out.println(getSum(1,2));
    }

    public static int getSum(int a, int b) {
        if (b == 0)
            return a;
        else
            return getSum(a ^ b, (a & b) << 1);
    }
}
