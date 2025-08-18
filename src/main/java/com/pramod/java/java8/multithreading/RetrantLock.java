package com.pramod.java.java8.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class RetrantLock {

    private static int count = 0;
    private static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {

        Runnable task = () -> {
            for (int i = 1; i < 3; i++) {
                increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    private static void increment() {

        try{
            lock.lock();
            count++;
            System.out.println(Thread.currentThread().getName()
                    + " incremented counter to: " + count);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();

        }


    }


}
