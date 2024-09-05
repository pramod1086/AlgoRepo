package com.pramod.geekforGeeks;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public static void main(String args[]) {
        LongestIncreasingSubsequence ls = new LongestIncreasingSubsequence();
        String str = "ABC";
        int [] nums = {10,9,2,5,3,7,101,18};
        //int [] nums = {0,1,0,3,2,3};
        System.out.println(ls.getLongestIncreasingSubsequence(nums));
    }

    private int getLongestIncreasingSubsequence(int[] nums) {
        int len = nums.length;

        int result[] = new int[len];
        Arrays.fill(result,1);

        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i] && result[i] <result[j]+1){
                    result[i] = result[j]+1;
                }
            }
        }

        int ans = result[0];
        for (int i = 1; i < len; i++) {
            ans = Integer.max(ans, result[i]);
        }
        return ans;
    }
}
