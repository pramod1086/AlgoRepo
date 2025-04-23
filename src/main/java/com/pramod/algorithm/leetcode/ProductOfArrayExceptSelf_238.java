package com.pramod.algorithm.leetcode;

public class ProductOfArrayExceptSelf_238 {
    public static void main(String args[]) {
        int arr[] = { 1,2,3,4};
        int[] k = new ProductOfArrayExceptSelf_238().productExceptSelf(arr);
        System.out.print(k);
    }

    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;

        int [] leftProduct = new int[length];
        int [] rightProduct = new int[length];

        int [] result = new int[length];

//        leftProduct[0]=nums[0];
//        rightProduct[0]=nums[length-1];

        int left = 1;

        for(int i =0;i<length;i++){
            left = nums[i]*left;
            leftProduct[i] = left;
        }
        int right = 1;

        for(int i =length-1;i>1;i--){
            right = nums[i]*right;
            rightProduct[i] = left;
        }

        for(int i =1;i<length;i++){
            result[i] = leftProduct[i]*rightProduct[i];
        }

        return result;






    }
}
