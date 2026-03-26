package com.pramod.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KPermutation_60 {

    public static void main(String args[]) {

        KPermutation_60 ks = new KPermutation_60();
        System.out.println(ks.getPermutation(4, 9));

    }


    public String getPermutation(int n, int k) {

        List<Integer> list = new ArrayList<>();
        StringBuilder result =new StringBuilder();
        int factorial = 1;

        for(int i=1;i<n;i++){
            factorial = factorial*i;
            list.add(i);


        }
        list.add(n);

        k = k-1;
        while(true){
            int index = k/factorial;

            int element = list.remove(index);
            result.append(element);

            if(list.isEmpty())
                break;
            k = k%factorial;
            factorial = factorial/list.size();


        }
        return result.toString();

    }
}
