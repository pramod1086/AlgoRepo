package com.pramod.algorithm.lru;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LRULinkedHashMapInternal {

    private final int capacity;

    private final HashMap map;



    public LRULinkedHashMapInternal(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap(capacity);
      //  private final HashMap map;

//        super(capacity, 0.75f, true); // true for access-order
//        this.capacity = capacity;
    }

    public String getCache(Integer key) {
       return (String) map.getOrDefault(key, null);
     //   return super.getOrDefault(key, null);
    }

    public void putCache(Integer key, String value) {

        map.put(key, value);
    }

    public static void main(String[] args) {
        LRULinkedHashMapInternal cache = new LRULinkedHashMapInternal(3); // LRU Cache with a capacity of 3

        cache.putCache(1, "One");
        cache.putCache(2, "Two");
        cache.putCache(3, "Three");

        System.out.println(cache.map); // {1=One, 2=Two, 3=Three}

        cache.getCache(1); // Access key 1, making it most recently used
        cache.putCache(4, "Four"); // Add key 4, evicting the least recently used key (key 2)

        System.out.println(cache.map); // {3=Three, 1=One, 4=Four}
    }

}


