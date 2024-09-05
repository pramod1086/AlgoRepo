package com.pramod.algorithm.bitwise;

public class XorOfNumber {
    public static void main(String[] args)
    {
        System.out.println(getXOR(10));


    }
    public static int getXOR(int n) {
        if(n % 4 == 0) {
            return n;
        }
        else if(n % 4 == 1) {
            return 1;
        }
        else if(n % 4 == 2) {
            return ++n;
        }
        else {
            return 0;
        }
    }

}
