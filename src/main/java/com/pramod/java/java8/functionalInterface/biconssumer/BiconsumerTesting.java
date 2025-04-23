package com.pramod.java.java8.functionalInterface.biconssumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiconsumerTesting {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Orange", 5);

        // Print each key-value pair
        BiConsumer<String, Integer> printEntry = (key, value) -> System.out.println(key + " : " + value);
        map.forEach(printEntry);

        // Output:
        // Apple : 3
        // Banana : 2
        // Orange : 5






    }
}
