package com.pramod.algorithm.lru;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
    int capacity = 0;
    LinkedList linkedList = new LinkedList();
    HashMap hashMap = null;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        hashMap = new HashMap(capacity);
    }



    public int get(int key)
    {

        if(hashMap.containsKey(key)){


        }
        System.out.println("Going to get the value " +
                "for the key : " + key);
        return 0;
    }

    public void setKey(int key)
    {
        System.out.println("Going to get the value " +
                "for the key : " + key);
      //  return map.getOrDefault(key, -1);
    }

}
