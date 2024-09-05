package com.pramod.algorithm.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class FindKtheElementUsingPriorityQueue {
    public static void main(String args[]) {
        int arr[] = { 3,2,3,1,2,4,5,5,6};
        int k = findKtheElementUsingPriorityQueue(arr,  4);
        System.out.print(k);
    }

    private static int findKtheElementUsingPriorityQueue(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        maxHeap.addAll(list);
        for(int i =0;i<k;i++){
            ans = maxHeap.poll();
        }
        return ans;
    }


}
