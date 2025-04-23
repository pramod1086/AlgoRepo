package com.pramod.java.java8.collection;

import java.util.PriorityQueue;

public class PriorityQueueTesting {

    public static void main(String args[]){
        PriorityQueue ps = new PriorityQueue();
        ps.add(40);
        ps.add(20);
        ps.add(30);
        ps.add(90);
        ps.add(1);

        int parent = (5 - 1) >>> 1;
        System.out.println(parent);
        System.out.println(ps);

       // Collections.sort();



    }
}
