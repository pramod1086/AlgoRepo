package com.pramod.algorithm.lru;

public class LRUTesting {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3); // LRU Cache with a capacity of 3

        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");

        System.out.println("Cache after adding 3 items: " + cache.hashMap);

        cache.get(1); // Access key 1, making it most recently used
        System.out.println("Cache after adding 3 items: " + cache.hashMap);
        System.out.println("LinkedList after adding 3 items: " + cache.linkedList);
        cache.put(4, "Four"); // Add key 4, evict the least recently used (key 2)

        System.out.println("Cache after accessing 1 and adding 4: " + cache.hashMap);
    }
}
