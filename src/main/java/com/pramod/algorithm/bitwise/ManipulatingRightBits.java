package com.pramod.algorithm.bitwise;

public class ManipulatingRightBits {
    public static void main(String args[]){

        int number = 13;
        int result = number & (number-1);

        System.out.println(result);
        int result2 = number |(number+1);

        System.out.println(result2);

    }
}
