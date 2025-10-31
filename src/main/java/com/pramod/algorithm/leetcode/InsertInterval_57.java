package com.pramod.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class InsertInterval_57 {

    public static void main(String args[]) {

        int[][] intervals = {{1, 3}, {6, 9}};


        int []  newInterval = {2,5};
        int[][] k = new InsertInterval_57().insert(intervals,newInterval);
        System.out.print("k");
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>();
       int  i = 0;


        for(int[] interval:intervals){
            int start = interval[0];
            int end = interval[1];
            if(end>newInterval[1]){
                list.add(interval);
            }

            //interna

            else if(start>newInterval[1]){
                list.add(newInterval);
                newInterval = interval;
            }else {
                newInterval[0]=Math.min(newInterval[0],interval[0]);
                newInterval[1]=Math.max(newInterval[1],interval[1]);
            }




        }
        list.add(newInterval);

        return list.toArray(new int[list.size()][]);


    }

}
