package com.pramod.algorithm.dynamicProgramming;

public class RodCuttingUsingRecursion {

    public static void main(String args[]){
        int arr[] = { 1, 5, 8, 9, 10, 17, 17, 20,24,30 };


        int maxProfit = cutRod(arr,3);
       System.out.println(maxProfit);
    }

    private static int cutRod(int[] arr, int n) {

        if(n==0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            max=Integer.max(max,arr[i-1]+cutRod(arr,n-i));
        }
        return max;
    }
}
