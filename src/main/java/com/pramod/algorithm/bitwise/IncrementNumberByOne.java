package com.pramod.algorithm.bitwise;

public class IncrementNumberByOne {
    static int getPosOfRightmostSetBit(int n)
    {
        return (int)(Math.log(n & -n) / Math.log(2));
    }

    // function to toggle the last m bits
    static int toggleLastKBits( int n, int k)
    {
        // calculating a number 'num' having
        // 'm' bits and all are set
        int num = (1 << k) - 1;

        // toggle the last m bits and return
        // the number
        return (n ^ num);
    }

    // function to increment a number by one
    // by manipulating the bits
    static int incrementByOne( int n)
    {
        if ((n & 1) == 0)
            return n | 1;
        else
            return incrementByOne(n>>1)<<1;
        // get position of rightmost unset bit
        // if all bits of 'n' are set, then the
        // bit left to the MSB is the rightmost
        // unset bit


    }

    // Driver Program
    public static void main (String[] args)
    {
        int n = 11;
        System.out.println(incrementByOne(n));

    }
}
