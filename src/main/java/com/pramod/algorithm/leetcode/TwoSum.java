package com.pramod.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {

    public static void main(String args[]) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Arrays.stream(twoSum(nums, target)).forEach(element->System.out.println(element));

       // Arrays.stream(anotherTwoSum(nums, target)).forEach(System.out::println);
    }

//    private static int[] anotherTwoSum(int[] nums, int target) {
//
//        int [] sum = new int[2];
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i :nums){
//
//            map.compute(i,sum-i);
//
//        }
//
//
//    }

    public static int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int value = nums[i];

            int updatedValue = target - value;
            if (map.isEmpty()) {
                map.put(0, updatedValue);
            } else {

                if (map.containsValue(value)) {
                    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                        if (entry.getValue().equals(value)) {
                            int key = entry.getKey();
                            arr[0] = key;
                            arr[1] = i;

                        }
                    }


                } else {
                    map.put(i, updatedValue);
                }


            }


        }

        return arr;

    }

//    public static int[] twoSums(int[] nums, int target) {
//
//        int[] arr = new int[2];
//
//        HashSet hs = new HashSet();
//
//        for (int i = 0; i < nums.length; i++) {
//
//            int value = nums[i];
//
//           int deficient = target-value;
//
//           if(hs.contains(deficient)){
//
//
//
//           }
//
//
//
//
//        }
//
//        return arr;
//
//    }
}

