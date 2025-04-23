package com.pramod.java.java8.Array;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String args[]){

        /// One way of array initialization
        int [] arr = {1,2,3,4,5};
        // another way of array initialization
        int[] num = new int[]{1,0,3,4,5};
        /// increment of array in java.Each value is incremented
        for(int i = 0; i < arr.length; i++)
        {
            arr[i]++;
        }
        Arrays.stream(arr).forEach(l->System.out.println(l));

        /// to add all element in array

        int sum = Arrays.stream(arr).reduce(0,(a,b)->a+b);
        System.out.println("the value of sum is _"+sum);

        System.out.println(Arrays.stream(num).sum());


    }
}
