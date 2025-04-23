package com.pramod.java.java8.multithreading.runnable;

public class ThreadTesting {

    private static ThreadLocal<Integer> integerThreadLocal = ThreadLocal.withInitial(()->1);
    public static void main(String args[]){
        RunnableTest runnableTest = new RunnableTest();
      //  RunnableTest runnableTest1 = new RunnableTest();
        Thread t1 = new Thread(runnableTest,"thread 1");
        Thread t2 = new Thread(runnableTest,"thread 2");

        t1.start();
        t2.start();

       new Thread(()->{
            integerThreadLocal.set(100);
        System.out.println(Thread.currentThread().getName() + " value: " + integerThreadLocal.get());

        }).start();
        new Thread(()->{
            integerThreadLocal.set(200);
            System.out.println(Thread.currentThread().getName() + " value: " + integerThreadLocal.get());

        }).start();

    }
}
