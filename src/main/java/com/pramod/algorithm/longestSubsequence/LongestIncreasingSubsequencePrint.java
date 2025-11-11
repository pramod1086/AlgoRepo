package com.pramod.algorithm.longestSubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequencePrint{

    ArrayList<Integer> result = new ArrayList();
    public static  void main(String args[]){
        int [] nums = {10,9,2,5,3,7,18,101};

        LongestIncreasingSubsequencePrint ls  = new LongestIncreasingSubsequencePrint();
        ls.getLongestIncreasingSubsequencedyanMicPrograming(nums);
        ls.getLongestIncreasingSubsequenceUsingRecursion(nums,0,Integer.MIN_VALUE ,new ArrayList<>());

        System.out.println(ls.result);

    }

    private <E> void getLongestIncreasingSubsequenceUsingRecursion(int[] nums, int currentIndex, int previous, ArrayList<Integer>current) {

        if(currentIndex==nums.length-1){
            if(result.size()<current.size()){
               result = new ArrayList<>(current);

            }
            return;
        }

        ///  Exlusion
        getLongestIncreasingSubsequenceUsingRecursion(nums,currentIndex+1,previous,current);

        ///  inclusion
        if(nums[currentIndex]>previous){
            current.add(nums[currentIndex]);
            getLongestIncreasingSubsequenceUsingRecursion(nums,currentIndex+1,nums[currentIndex],current);
            current.remove(current.size()-1);
        }

    }




    private void getLongestIncreasingSubsequencedyanMicPrograming(int[] nums) {

        int dp[] = new int[nums.length];
        int previous[] = new int[nums.length];
        Arrays.fill(dp,1);
        Arrays.fill(previous,-1);
        int lastIndex = 0;

        for(int i=1;i<nums.length;i++){

            for(int j=0;j<i;j++){

                if(nums[i]>nums[j] && dp[i] < dp[j] + 1){
                    dp[i]= Math.max(dp[i],1+dp[j]);
                    previous[i] = j; // ✅ track predecessor
                }
            }
            lastIndex = i;
        }

        // 🔁 Reconstruct LIS from 'previous' array
        List<Integer> lis = new ArrayList<>();
        for (int i = lastIndex; i != -1; i = previous[i]) {
            lis.add(nums[i]);
        }
        Collections.reverse(lis);
        System.out.println("dione"+" "+lis);

        System.out.println("dione"+" "+dp[nums.length-1]);
    }

}
