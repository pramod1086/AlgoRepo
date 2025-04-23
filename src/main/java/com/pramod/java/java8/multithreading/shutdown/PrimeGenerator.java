package com.pramod.java.java8.multithreading.shutdown;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator implements Runnable{

    private final List<BigInteger> primes = new ArrayList<>();

    private volatile boolean cancelled;
    @Override
    public void run() {
        BigInteger bigInteger = BigInteger.ONE;
        while(!cancelled){
            bigInteger = bigInteger.nextProbablePrime();
            synchronized (this){
                primes.add(bigInteger);
            }
        }

    }
    public void setCancelled(){
        cancelled = true;
    }
    public synchronized List<BigInteger> get(){
       return new ArrayList<>(primes);
    }
}
