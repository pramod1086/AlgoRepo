package com.pramod.java.java8.multithreading.oddeven;

public class OddEvenPrint {
    public static void main(String args[]){

        OddEven os = new OddEven();
        EvenPrint evenPrint = new EvenPrint(os);

        OddPrint odd = new OddPrint(os);

        Thread t1 = new Thread(evenPrint);

        Thread t2 = new Thread(odd);
        t1.start();
        t2.start();

    }
}
