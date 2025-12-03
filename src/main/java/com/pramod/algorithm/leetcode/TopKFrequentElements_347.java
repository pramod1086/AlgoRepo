package com.pramod.algorithm.leetcode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequentElements_347 {
    public static void main(String args[]) {
        int [] nums = {1,1,1,2,2,3};
        int k =2;

        TopKFrequentElements_347 ts = new TopKFrequentElements_347();
       int[] ar =  ts.topKFrequent(nums,k);
        System.out.println("First two entries: " + ar);
    }

    public int[] topKFrequent(int[] nums, int k) {


        Map<Integer, Long> map =  Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        return map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(k)
                .map(e->e.getKey()).collect(Collectors.toList()).stream().mapToInt(Integer::intValue).toArray();

//        LinkedHashMap<Integer, Long> sortedMapDesc = map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (e1, e2) -> e1, // Merge function
//                        LinkedHashMap::new // Supplier to create a LinkedHashMap
//                ));
//
//
//       return sortedMapDesc.entrySet().stream().limit(k).map(el->el.getKey()).collect(Collectors.toList()).stream()
//               .mapToInt(Integer::intValue) // Map Integer objects to int primitives
//               .toArray();


    }
}
