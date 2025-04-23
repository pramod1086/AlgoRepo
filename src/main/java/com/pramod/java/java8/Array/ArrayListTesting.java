package com.pramod.java.java8.Array;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayListTesting {
    public static void main(String args[]){
        Queue arrayList = new ArrayDeque<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(5);

        arrayList.remove(2);

        arrayList.stream().forEach(System.out::println);

    }
}
