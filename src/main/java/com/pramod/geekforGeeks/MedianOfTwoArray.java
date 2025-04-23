package com.pramod.geekforGeeks;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class MedianOfTwoArray {

    public static void main(String [] args){

        int[] arr1 = { -5, 3, 6, 12, 15 };
        int[] arr2 = { -12, -10, -6, -3, 4, 10 };

        System.out.println(getMedian(arr1, arr2));
    }

    private static boolean getMedian(int[] arr1, int[] arr2) {

        int len = arr1.length;

        int len2 = arr2.length;

        int arr[] = new int[len+len2];

        System.arraycopy(arr1,0,arr,0,len);
        System.arraycopy(arr2,0,arr,len,len2);

        Arrays.sort(arr);
        return true;

    }


}
