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



    public String get(Integer key)
    {
        if(!hashMap.containsKey(key)){
            return null;
        }


        linkedList.remove(key);
        linkedList.addFirst(key);

        return  (String) hashMap.get(key);
    }

    public void put(int key,String value)
    {

        if(hashMap.containsKey(key)){
            linkedList.remove(key);

        }else if(hashMap.size()>=capacity){
            Integer lis = (Integer)linkedList.removeLast();
            hashMap.remove(lis);
        }
        hashMap.put(key,value);
        linkedList.addFirst(key);

    }

}
