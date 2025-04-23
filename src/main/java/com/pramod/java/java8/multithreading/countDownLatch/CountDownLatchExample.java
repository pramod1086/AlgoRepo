package com.pramod.java.java8.multithreading.countDownLatch;

import java.util.concurrent.CountDownLatch;

import static java.lang.System.out;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        new Thread(() -> {
            // Some operation
            out.println("First Thread Execution.");

            latch.countDown();
        }).start();

        new Thread(() -> {
            // Another operation
            out.println("Second Thread Execution.");
            latch.countDown();
        }).start();

        new Thread(() -> {
            // Yet another operation
            out.println("Third Thread Execution.");

            latch.countDown();
        }).start();

        new Thread(() -> {
            // Yet another operation
            out.println("Fourth Thread Execution.");

            latch.countDown();
        }).start();
        out.println("Before Await operations completed.");
        latch.await(); // Main thread waits until count becomes zero
        out.println("All operations completed.");
    }
}
