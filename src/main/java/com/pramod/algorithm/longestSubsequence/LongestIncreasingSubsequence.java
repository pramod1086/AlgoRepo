package com.pramod.algorithm.longestSubsequence;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public static void main(String args[]) {
        LongestIncreasingSubsequence ls = new LongestIncreasingSubsequence();
        int [] nums = {10,9,2,5,3,7,101,18};

        System.out.println(ls.getLongestIncreasingSubsequence(nums));
        System.out.println(ls.getLongestIncreasingSubsequenceUsingRecursion(nums));
        System.out.println(ls.getLongestIncreasingSubsequenceUsingMemoization(nums));
        System.out.println(ls.getLongestIncreasingSubsequenceUsingBinarySearch(nums));

    }



    private int getLongestIncreasingSubsequenceUsingBinarySearch(int[] nums) {

        int arr[] = new int[nums.length];

        int length = 0;

        for(int value:nums){
            int index = Arrays.binarySearch(arr,0,length,value);

            if(index <0){
                index = -(index+1);
            }

            arr[index] = value;

            if(index==length){
                length++;
            }

        }
        return length;


    }

    private int getLongestIncreasingSubsequence(int[] nums) {
        int len = nums.length;

        int result[] = new int[len];
        Arrays.fill(result,1);

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    result[i] = Math.max(result[i], result[j] + 1);
                }
            }
        }

        int ans = result[0];
        for (int i = 1; i < len; i++) {
            ans = Integer.max(ans, result[i]);
        }
        return ans;
    }

    /// using  Recursion

    private int     getLongestIncreasingSubsequenceUsingRecursion(int[] nums) {

        return lis(nums,Integer.MIN_VALUE, 0);
    }

    private int lis(int[] nums, int previous, int currentIndex) {

        int length = nums.length;

        if (currentIndex == length) {
            return 0;
        }

        // Option 1: Exclude current element
        int excl = lis(nums, previous, currentIndex + 1);

        int incl = 0;
        if (nums[currentIndex] > previous) {
            incl = 1 + lis(nums, nums[currentIndex], currentIndex + 1);
        }

        return Math.max(incl, excl);

    }

    ///using Memoization

    private int getLongestIncreasingSubsequenceUsingMemoization(int[] nums) {

        int length = nums.length;

        int arr [] [] = new int[length][length+1];
        for(int row[]:arr){
            Arrays.fill(row, -1);
        }


        return lisUsingMemoization(nums,0, -1,arr);
    }
    // At each step we need to store inluded and non non included that is previous anc current index,

    private int lisUsingMemoization(int[] nums,  int currentIndex,int previous, int[][] memo) {
//int index = 10;
//        index = -(index + 1); // Get inserti
//
//        System.out.println(index);

        int length = nums.length;

        if (currentIndex == length) {
            return 0;
        }

        if(memo[currentIndex][previous+1]!=-1){
            return memo[currentIndex][previous+1];
        }
        int exclude = lisUsingMemoization(nums, currentIndex+1 ,previous, memo);

        int include =0;

        if(previous == -1 ||nums[currentIndex]>nums[previous]){
            include = 1+ lisUsingMemoization(nums,currentIndex+1,currentIndex,memo);
        }

        memo[currentIndex][previous+1] = Math.max(include, exclude);

        return memo[currentIndex][previous+1];

    }

    ///using dynamic programming and binary search


    


}
