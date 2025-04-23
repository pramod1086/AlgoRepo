package com.pramod.java.java8.multithreading.oddeven;

public class OddPrint implements Runnable{

    int odd = 1;
    private final int limit =20;
    OddEven os = new OddEven();

    OddPrint(OddEven os){
        this.os = os;
    }
    @Override
    public void run() {
        try {
            while (odd<limit) {
                os.printOdd(odd);
                odd = odd+2;
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
