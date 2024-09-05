package com.pramod.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String args[]){
        ExecutorService ex = Executors.newFixedThreadPool(5);
       // ex.submit()
    }
}
