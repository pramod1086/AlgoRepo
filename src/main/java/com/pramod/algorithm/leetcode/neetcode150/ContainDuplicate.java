package com.pramod.algorithm.leetcode.neetcode150;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ContainDuplicate {
    public static void main(String args[])
    {
        int [] nums = {1, 2, 3, 4};

        System.out.println(hasDuplicate(nums));
    }

    private static Boolean hasDuplicate(int[] nums) {

        Map<Integer, Long> mns =  Arrays.stream(nums).boxed().collect(Collectors.groupingBy(item->item,Collectors.counting()));

        Optional<Map.Entry<Integer, Long>> entry =  mns.entrySet().stream().filter(element->element.getValue()>1).findAny();
        return entry.isPresent();


//       Map.Entry<Integer,Long> entry =  mns.entrySet().stream().filter(element->element.getValue()>1).findAny().get();
//       if(entry.getValue()>1){
//           return true;
//       }
//       return false;
    }
}
