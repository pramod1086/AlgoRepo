package com.pramod.algorithm.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindDuplicateInArray {

    public static void main(String args[]) {

       // int [] nums = {1,3,4,2,2};
        int [] nums = {3,1,3,4,2};


        usingCountingSort(nums);

        pointerMethod(nums);

        usingXorMethod(nums);
    }

    private static void usingXorMethod(int[] nums) {
        int n = nums.length;
        int x = 0;
        for (int i = 1; i <= n - 1; i++)
            x = x ^ i;

        // Initialise Y as 0 and update Y = Y ^ nums[i] at every iteration
        int y = 0;
        for (int i = 0; i < nums.length; i++)
            y = y ^ nums[i];

        // Duplicate element is (x^y)
        System.out.println(x^y);
    }

    private static void usingCountingSort(int[] nums) {
        int len = nums.length;

        int ans =0;

        // one way of using it using counting sort
        int[] countingSort = new int[len];

        for(int i=0;i<len;i++){
            countingSort[nums[i]]++;
        }

        OptionalInt duplicate = Arrays.stream(countingSort).filter(count->count>=2).findFirst();

        for(int i =0 ;i<len;i++){
            if(countingSort[i]>1){

                ans = i;
                break;

            }
        }
        //System.out.println(duplicate.getAsInt());
        System.out.println(ans);
    }

    private static void pointerMethod(int[] nums) {
        int  slow = 0;
        int fast = 0;
        int ans = 0;

        while (true)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast)
                break;
        }

        while (ans != slow) {

            ans = nums[ans];
            slow = nums[slow];
        }

        System.out.println(ans);

    }


}
