package com.pramod.algorithm.lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRULinkedHashMap <K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRULinkedHashMap(int capacity) {
        super(capacity, 0.75f, true); // true for access-order
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity; // Remove the oldest entry if the size exceeds capacity
    }

    public V getCache(K key) {
        return super.getOrDefault(key, null);
    }

    public void putCache(K key, V value) {
        super.put(key, value);
    }

    public static void main(String[] args) {
        LRULinkedHashMap<Integer, String> cache = new LRULinkedHashMap<>(3); // LRU Cache with a capacity of 3

        cache.putCache(1, "One");
        cache.putCache(2, "Two");
        cache.putCache(3, "Three");

        System.out.println(cache); // {1=One, 2=Two, 3=Three}

        cache.getCache(1); // Access key 1, making it most recently used
        cache.putCache(4, "Four"); // Add key 4, evicting the least recently used key (key 2)

        System.out.println(cache); // {3=Three, 1=One, 4=Four}
    }

}
