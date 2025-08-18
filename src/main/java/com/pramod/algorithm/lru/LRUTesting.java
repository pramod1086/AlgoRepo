package com.pramod.algorithm.lru;

public class LRUTesting {
    public static void main(String[] args) {
//        LRUCache cache = new LRUCache(3); // LRU Cache with a capacity of 3
//
//        cache.put(1, "One");
//        cache.put(2, "Two");
//        cache.put(3, "Three");
//
//        System.out.println("Cache after adding 3 items: " + cache.hashMap);
//
//        cache.get(1); // Access key 1, making it most recently used
//        System.out.println("Cache after adding 3 items: " + cache.hashMap);
//        System.out.println("LinkedList after adding 3 items: " + cache.linkedList);
//        cache.put(4, "Four"); // Add key 4, evict the least recently used (key 2)
//
//        System.out.println("Cache after accessing 1 and adding 4: " + cache.hashMap);



        LRUCacheUsingDoubleLinkedList lRUCache = new LRUCacheUsingDoubleLinkedList(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        lRUCache.put(3, 3);
    ;    // return 1
        System.out.println("Cache after accessing lRUCache.get(1) and adding 1 and 2: " +     lRUCache.get(1));
        //lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println("Cache after accessing lRUCache.get(1) and adding 3: " +     lRUCache.get(2));
        lRUCache.put(4, 4); // LRU key was 1, evicts key
        // 1, cache is {4=4, 3=3}
        System.out.println("Cache after accessing lRUCache.get(1) and adding 4: " +     lRUCache.get(1));
        System.out.println("Cache after accessing lRUCache.get(1) and adding 4: " +     lRUCache.get(3));
        System.out.println("Cache after accessing lRUCache.get(1) and adding 4: " +     lRUCache.get(4));

    }
}
