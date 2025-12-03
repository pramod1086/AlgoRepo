package com.pramod.java.java8;

import java.util.*;

public class TestingClass {
    public static void main(String[] args)
    {

        int [] nums = {10, 22, 33, 50};
        int index = Arrays.binarySearch(nums,0,nums.length,11);


        System.out.println(String.valueOf(Math.abs(200)).length());
        //System.out.println(Math.abs(200));
        //System.out.println(index);


    }

    public class GraphBFS {

        public void bfs(ArrayList<ArrayList<Integer>> adj){
            int size = adj.size();

            int start = 0;
            Queue<Integer> qs = new LinkedList();
            boolean [] visited = new boolean[size];

            qs.add(start);
            visited[start]=true;

            while(!qs.isEmpty()){
                int element = qs.poll();
                List<Integer> ls = adj.get(element);

                for(int x :ls){
                    if(!visited[x]){
                        qs.add(x);
                        visited[x]=true;
                    }
                }

            }
        }
    }
}

/// Lts Write Bfs for a graph


