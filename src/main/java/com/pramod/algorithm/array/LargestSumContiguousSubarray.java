package com.pramod.algorithm.array;

public class LargestSumContiguousSubarray {
    public static void main(String args[]) {

        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(largestSubarraySum(arr));
        System.out.println(maxSubArraySum(arr,arr.length));

    }

    private static int largestSubarraySum(int[] arr) {

        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < arr.length; i++)
        {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    private static  int maxSubArraySum(int arr[], int size){
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        int start = 0;int end=0;int current =0;
        for (int i = 0; i < arr.length; i++){
            max_ending_here = max_ending_here +arr[i];

            if (max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
                start = current;
                end = i;
            }

            if(max_ending_here<0){
                max_ending_here = 0;
                current= i+1;

            }
        }

        System.out.println(start);
        System.out.println(end);
        return 0;
        }
        {
    }
}
