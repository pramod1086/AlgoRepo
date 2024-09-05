package com.pramod.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletablefutureTesting {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Object> cs = new CompletableFuture<>().whenComplete((String, throwable) -> {

        });
        cs.get();
    }


}
