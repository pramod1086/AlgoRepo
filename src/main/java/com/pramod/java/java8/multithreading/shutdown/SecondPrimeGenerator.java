package com.pramod.java.java8.multithreading.shutdown;

import java.util.concurrent.TimeUnit;

public class SecondPrimeGenerator {
    public static void main(String args[]) throws InterruptedException {

        PrimeGenerator primeGenerator = new PrimeGenerator();

       Thread t1 =  new Thread(primeGenerator);
       t1.start();

        try{
            TimeUnit.SECONDS.sleep(1);

        }finally {
            primeGenerator.setCancelled();

        }

        primeGenerator.get().stream().forEach(element-> System.out.println(element.intValue()));


    }
}
