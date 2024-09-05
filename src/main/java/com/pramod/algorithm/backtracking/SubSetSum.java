package com.pramod.algorithm.backtracking;

public class SubSetSum {
    public static void main(String args[]){
        int arr[] = {8,6,7,5,3,10,9};
        int sum =15;
       // subSetSum(arr,sum,arr.length);
        if (subSetSum(arr,sum,arr.length) == true)
            System.out.println("Found a subset"
                    + " with given sum");
    }
    private static boolean subSetSum(int[] arr, int sum, int n) {
        boolean subset[][] = new boolean[sum + 1][n + 1];

        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++)
            subset[0][i] = true;

        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i <= sum; i++)
            subset[i][0] = false;

        // Fill the subset table in bottom
        // up manner
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= arr[j - 1])
                    subset[i][j] = subset[i][j]
                            || subset[i - arr[j - 1]][j - 1];
            }
        }

        /* // uncomment this code to print table
        for (int i = 0; i <= sum; i++)
        {
        for (int j = 0; j <= n; j++)
            System.out.println (subset[i][j]);
        } */

        return subset[sum][n];
    }

        private static boolean subSetSumRecursive(int[] arr, int sum, int length) {
        if(sum==0){
            return true;
        }
        if(sum<0){
            return false;

        }
        if (arr[length - 1] > sum)
            return subSetSumRecursive(arr, length - 1, sum);

        /* else, check if sum can be obtained
        by any of the following
            (a) including the last element
            (b) excluding the last element */
        return subSetSumRecursive(arr, sum,length - 1)
                || subSetSumRecursive(arr, sum - arr[length - 1],length - 1);
       // return false;

    }
}
