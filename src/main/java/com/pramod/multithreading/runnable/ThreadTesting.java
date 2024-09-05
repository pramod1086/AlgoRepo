package com.pramod.multithreading.runnable;

public class ThreadTesting {
    public static void main(String args[]){
        RunnableTest runnableTest = new RunnableTest();
      //  RunnableTest runnableTest1 = new RunnableTest();
        Thread t1 = new Thread(runnableTest,"thread 1");
        Thread t2 = new Thread(runnableTest,"thread 2");

        t1.start();
        t2.start();
    }
}
