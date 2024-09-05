package com.pramod.algorithm.dynamicProgramming;

public class RodcuttingMemotized {
    public static void main(String args[]){
        int arr[] = { 1, 5, 8, 9, 10, 17, 17, 20,24,30 };


        int maxProfit = cutRod(arr,3);
        System.out.println(maxProfit);
    }

    private static int cutRod(int[] arr, int i) {
        int aux[] =new int[i] ;
        return memoizedcutRod(arr,i,aux);
    }

    private static int memoizedcutRod(int[] arr, int len, int[] aux) {
        if(len==0){
            return 0;
        }
        if(aux[len-1]>0){
            return aux[len-1];
        }

        int q= Integer.MIN_VALUE;
        for(int i=1;i<=len;i++){
            q=Integer.max(q,arr[i-1]+memoizedcutRod(arr,len-i,aux));
        }
        aux[len-1]=q;
        return q;



    }
}
