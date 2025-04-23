package com.pramod.java.java8.multithreading.runnable;

public class RunnableTest implements Runnable{
    int count =0;

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            count++;

        }
        System.out.println("The value of the count is"+Thread.currentThread().getName() +" is "  +""+ count);
    }
}
