package com.pramod.java.java8.multithreading.virtualThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VirtualThread {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = Thread.ofVirtual().start(() -> System.out.println("Hello"));
        thread.join();

        Thread.Builder builder = Thread.ofVirtual().name("Thread testing");
        Runnable task = () -> {
            System.out.println("Running thread");
        };

        Thread t = builder.start(task);
        System.out.println("Thread t name: " + t.getName());
        t.join();

        ExecutorService executorService  =Executors.newVirtualThreadPerTaskExecutor();
        try{
            Future<?> future = executorService.submit(()->System.out.println("thread is running"));
            Future<String> callable = executorService.submit(()->{
                return "you have completed the task";
            });
            System.out.println(future.get());
            System.out.println(callable.get());



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    }
