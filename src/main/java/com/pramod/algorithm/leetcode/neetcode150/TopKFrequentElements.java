package com.pramod.algorithm.leetcode.neetcode150;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequentElements {

    public static void main(String args[])
    {
////
////        Compression_443 cs = new Compression_443();
////        char [] input  = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
///
////
////        System.out.println(cs.compress(input));

        int [] nums = new int[]{1,2,2,3,3,3};int  k = 2;
        TopKFrequentElements ts = new TopKFrequentElements();
        ts.topKFrequent(nums,k);

    }


    public int[] topKFrequent(int[] nums, int k) {

//Map<Integer, Integer> hs = new HashMap<>();

        int arr[]= new int[k];

        Map<Integer, Long> hs  = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        PriorityQueue<Map.Entry<Integer, Long> > ps = new PriorityQueue<>((e1,e2)->Long.compare(e2.getValue(),e1.getValue()));


        ps.addAll(hs.entrySet());

        for(int i=k-1;i>=0;i--){
            arr[i]=ps.poll().getKey();
        }

        return arr;




    }
}
