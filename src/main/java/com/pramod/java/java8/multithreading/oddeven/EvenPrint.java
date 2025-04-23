package com.pramod.java.java8.multithreading.oddeven;

public class EvenPrint implements Runnable{

    int even = 0;
    private final int limit =20;
    private OddEven oddEven;
    EvenPrint(OddEven oddEven){
        this.oddEven = oddEven;

    }
    @Override
    public void run() {
        try {
            while (even<limit) {
                oddEven.printEven(even);
                even = even+2;
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
