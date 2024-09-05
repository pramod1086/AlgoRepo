package com.pramod.algorithm.leetcode;

import javax.swing.plaf.InsetsUIResource;
import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String args[])
    {
        //int [] num = {1,-1};
        int [] num = {1,3,-1,-3,5,3,6,7};
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        int [] returnedArray = slidingWindowMaximum.maxSlidingWindow(num,3);
        Arrays.stream(returnedArray).forEach(System.out::println);
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        res.add(nums[dq.peekFirst()]);

        for (int i = k; i < nums.length; i++) {
            if (dq.peekFirst() == i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }

            dq.offerLast(i);
            res.add(nums[dq.peekFirst()]);
        }
        return res.stream().mapToInt(i->i).toArray();


    }
}

