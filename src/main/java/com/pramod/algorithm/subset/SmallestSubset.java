package com.pramod.algorithm.subset;


import java.util.*;

/**
 * smallest subset (fewest elements) whose sum is strictly greater than the sum of all remaining elements.
 */

public class SmallestSubset {
    public static void main (String[] args)
    {
        SmallestSubset s = new SmallestSubset();
        int[] nums = {3, 1, 7, 1, 2, 9};
        s.smallestSubsetGreaterThanRest(nums);

    }
    public static List<Integer> smallestSubsetGreaterThanRest(int[] nums) {

        int sum = Arrays.stream(nums).sum();

        Integer[] arr =Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr,Collections.reverseOrder());

        List<Integer> subset = new ArrayList<>();

        return subset;
    }
}
