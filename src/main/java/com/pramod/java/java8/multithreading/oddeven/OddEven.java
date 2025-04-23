package com.pramod.java.java8.multithreading.oddeven;

public class OddEven {

    private volatile boolean isOdd = true;

    public  synchronized void printOdd(int value) throws InterruptedException {

        if(!isOdd){
            wait();
        }
        isOdd = false;
        System.out.println("the value of Odd is "+value);
        notifyAll();


    }

    public synchronized  void printEven(int value) throws InterruptedException {
        if(isOdd){
            wait();
        }
        isOdd = true;
        System.out.println("the value of even is "+value);
        notifyAll();
    }

}
