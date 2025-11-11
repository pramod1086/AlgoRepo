package com.pramod.algorithm.leetcode;

public class ProductSubArray {
    public static void main(String args[]) {
        int arr[] = { 2,3,-2,4};
        int k = new ProductSubArray().maxProduct(arr);
        System.out.print(k);
    }

    public int maxProduct(int[] nums) {

        int max =  nums[0];
        for (int i=0;i<nums.length;i++){
            int product = 1;
            for(int j=i;j<nums.length;j++){
                product = product*nums[j];

                max = Math.max(product,max);

            }
        }
        return max;


    }
}
