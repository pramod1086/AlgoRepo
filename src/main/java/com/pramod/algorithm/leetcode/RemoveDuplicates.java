package com.pramod.algorithm.leetcode;

public class RemoveDuplicates {

    public static void main(String args[]){
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicatest(nums);
    }

    private static void removeDuplicatest(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
     //   return j;
        System.out.println(j);
    }

}
