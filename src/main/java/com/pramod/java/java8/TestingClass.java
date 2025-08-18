package com.pramod.java.java8;

import java.util.Arrays;

public class TestingClass {
    public static void main(String[] args)
    {

        int [] nums = {10, 22, 33, 50};
        int index = Arrays.binarySearch(nums,0,nums.length,11);
        System.out.println(index);


    }
}
