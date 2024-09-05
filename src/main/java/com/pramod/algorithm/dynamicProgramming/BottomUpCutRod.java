package com.pramod.algorithm.dynamicProgramming;

public class BottomUpCutRod {
    public static void main(String args[]){
        int arr[] = { 1, 5, 8, 9, 10, 17, 17, 20,24,30 };


        int maxProfit = bottomUpCutRod(arr,3);
        System.out.println(maxProfit);
    }

    private static int bottomUpCutRod(int[] arr, int n) {
        int []aux = new int[n];
        aux[0]=0;
        for(int j=1;j<=n;j++){
            int q= Integer.MIN_VALUE;
            for(int i=1;i<=j;i++){
                q=Integer.max(q,arr[i]+aux[j-1]);

            }
            aux[j-1]=q;

        }
        return aux[n-1];

    }
}
