package com.pramod.java.java8.multithreading.producerconsumer;


import java.util.*;
public class ProducerConsumer {

    private static final Queue<Integer> queue = new LinkedList<>();

    // Maximum capacity of the queue
    private static final int CAPACITY = 10;

    Runnable producer = () -> {
        while (true) {
            synchronized (queue) {
                if (queue.size() == CAPACITY) {

                    try {
                        System.out.println("you have reached capacity");
                        queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                queue.add(10);
                System.out.println("Added 10 to the queue");
                queue.notifyAll();

            }
        }

    };

    Runnable consumer = () -> {
        while (true) {
            synchronized (queue) {
                if (queue.size() == 0) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                int elment = queue.poll();
                System.out.println("Removed element   from the queue" + elment);
                queue.notifyAll();

            }

        }

    };

    public static void main(String args[]){
        System.out.println("Main thread started");
        ProducerConsumer ps = new ProducerConsumer();
        // Create and start the producer thread
        Thread producerThread = new Thread(ps.producer, "Producer");
        // Create and start the consumer thread
        Thread consumerThread = new Thread(ps.consumer, "Consumer");
        producerThread.start();
        consumerThread.start();
        System.out.println("Main thread exiting");
    }
}
