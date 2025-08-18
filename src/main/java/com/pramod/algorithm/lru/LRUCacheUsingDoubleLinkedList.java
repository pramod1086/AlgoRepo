package com.pramod.algorithm.lru;

public class LRUCacheUsingDoubleLinkedList {

    public class Node{
        int key ;
        int value;
        Node previous,next;
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }

    public Node[] cache;
    public int capacity;
    public int count;

    public Node head, tail;

    public LRUCacheUsingDoubleLinkedList(int capacity){
        this.capacity = capacity;
        cache = new Node[10_000+1];
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.previous = head;

    }
    // Move node to head (most recent)
    private void moveToHead(Node node) {
        removeNode(node);
        addNode(node);
    }
    // Remove a node
    private void removeNode(Node node) {
        Node prev = node.previous;
        Node next = node.next;
        if(prev!=null){
            prev.next = next;
        }
        if(next!=null){
            next.previous = prev;
        }

    }
    // Remove node from tail (least recent)
    private Node removeTail() {
       Node ns =  tail.previous ;
       removeNode(ns);
       return ns;

    }
    public void put(int key, int value) {

        Node cachedData = cache[key];
        if(cachedData==null){
            Node ns = new Node(key,value);
            cache[key] = ns;
            count++;
            addNode(ns);

            if(count>capacity){
                cache[tail.previous.key] = null;
                removeTail();
                count--;

            }
        }else {
            cachedData.value = value;
            moveToHead(cachedData);

        }


    }


    private void addNode(Node node) {
        node.previous = head;
        node.next = head.next;

        head.next.previous = node;
        head.next = node;

    }

    public int get(int key) {

        Node node = cache[key];
        if (node == null)
            return -1;

        moveToHead(node);
        return node.value;

    }
}
