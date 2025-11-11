package com.pramod.java.java8.collection;

import com.pramod.java.model.Ticket;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTesting {
    private PriorityQueue<Integer> maxHeap; // Lower half
    private PriorityQueue<Integer> minHeap; // Higher half

    public PriorityQueueTesting() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if (minHeap.size() > maxHeap.size())
            maxHeap.offer(minHeap.poll());
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size())
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        else
            return maxHeap.peek();
    }

    public static void main(String args[]){
        PriorityQueue ps = new PriorityQueue();

        ps.add(40);
        ps.add(20);
        ps.add(30);
        ps.add(90);
        ps.add(1);
        PriorityQueueTesting ps1 = new PriorityQueueTesting();

//addNum(1)
//addNum(2)
//findMedian() → 1.5
//addNum(3)
//findMedian() → 2
        ps1.addNum(1);
        ps1.addNum(2);
//        System.out.println(ps1.findMedian());
        ps1.addNum(3);

        System.out.println(ps1.findMedian());

//        int parent = (5 - 1) >>> 1;
//        System.out.println(parent);
//        System.out.println(ps);
//
//        ps1.offer(ps.poll());
//
//        System.out.println(ps1);

        // Collections.sort();


//        PriorityQueue<Ticket> ticket = new PriorityQueue<Ticket>((a1,b1)->{
//          return Integer.compare(a1.getAge(),b1.getAge());
//
//
//        });

        // Collections.sort();


       // PriorityQueue<Ticket> ticket1 = new PriorityQueue<>(Comparator.comparingInt(Ticket::getPriority).thenComparing(Ticket::getAge));


    }
}
