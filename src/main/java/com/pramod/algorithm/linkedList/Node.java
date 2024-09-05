package com.pramod.algorithm.linkedList;

public class Node {

    int data;
    Node next;
    Node() {}
    public Node(int data) { this.data = data; }
    Node(int data, Node next) { this.data = data; this.next = next; }

    public int hashCode(Object O){

        Node n = (Node)O;
        int result = data;
        result = result +Integer.hashCode(next.hashCode());

        return result;

    }
}


