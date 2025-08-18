package com.pramod.algorithm.leetcode;

public class TimeBasedKeyValueStore_981 {
    Node n;

    TimeBasedKeyValueStore_981(){
        n = new Node();
    }


    public void set(String key, String value, int timestamp) {
        n = new Node(key, value, timestamp, n);

    }

    public String get(String key, int timestamp) {
        return search(key, timestamp, n);
    }

    private String search(String key, int timestamp, Node n) {
        if (n == null) return "";
        if (key.equals(n.key) && timestamp >= n.timestamp) return n.value;
        return search(key, timestamp, n.prev);
    }


    public static void main(String args[]) {
        TimeBasedKeyValueStore_981 kv = new TimeBasedKeyValueStore_981();
        kv.set("foo", "bar", 1);
        kv.get("foo", 1);   // "bar"
        kv.get("foo", 3);   // "bar"

        kv.set("foo", "bar2", 4);
        kv.get("foo", 4);   // "bar2"
        kv.get("foo", 5);   // "
    }

    static class Node {
        String key;
        String value;
        int timestamp;
        Node prev;

        public Node() {
        }

        public Node(String key, String value, int timestamp, Node prev) {
            this.key = key;
            this.value = value;
            this.timestamp = timestamp;
            this.prev = prev;
        }

    }
}
