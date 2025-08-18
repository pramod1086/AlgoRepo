package com.pramod.algorithm.lru;

import java.util.HashMap;
import java.util.Map;

public class LruCacheUsingMapDoublyLinkedList {

    class Node{
        int data,value;
        Node next ,previous;
        public Node(int key,int value){
            this.data = key;
            this.value = value;
        }
    }

    int capacity;
    Map<Integer,Node> cache ;
    Node head,tail;

    LruCacheUsingMapDoublyLinkedList(int capacity){
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        Node head = new Node(-1,-1);
        Node tail = new Node(-1,-1);
        head.next= tail;
        tail.previous = head;

    }

    public void put(int key, int value) {
        Node cachedData =   cache.get(key);
        if(cachedData==null){
            Node ns = new Node(key,value);
            cache.put(key,ns);
            addNode(ns);
           if(cache.size()>capacity) {

               Node tail = removeTail();
               cache.remove(tail.data);
           }

        }else {

            cachedData.value = value;
            moveToHead(cachedData);

        }

    }

    private void addNode(Node ns) {
        ns.next = head.next;
        ns.previous = head.previous;
        head.next.previous = ns;
        head.next = ns;

    }

    private void moveToHead(Node cachedData) {
        removeNode(cachedData);
        addNode(cachedData);
    }

    private void removeNode(Node cachedData) {
        if(cachedData.next!=null){
            cachedData.next.previous = cachedData.previous;
            cachedData.previous.next = cachedData.next;
        }



    }


    private Node removeTail() {
        Node removed = tail.previous;
        removeNode(removed);

        return removed;
    }

    public Integer get(int key) {
      Node cachedData =   cache.get(key);
      if(cachedData==null){
          return -1;
      }
      moveToHead(cachedData);
      return cachedData.value;


    }


}
