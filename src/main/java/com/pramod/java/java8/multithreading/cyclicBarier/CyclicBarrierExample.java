package com.pramod.java.java8.multithreading.cyclicBarier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static java.lang.System.out;

public class CyclicBarrierExample {
    private static final int THREAD_COUNT = 3;

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(THREAD_COUNT, () -> out.println("All threads reached the barrier. Continue with the next step."));

        for (int i = 0; i < THREAD_COUNT; i++) {
            new Thread(() -> {
                try {
                    out.println("Thread " + Thread.currentThread().getId() + " is waiting at the barrier.");
                    barrier.await(); // This thread will wait until all threads reach the barrier
                    out.println("Thread " + Thread.currentThread().getId() + " passed the barrier.");
                } catch (InterruptedException  |BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
