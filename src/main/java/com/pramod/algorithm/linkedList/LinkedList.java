package com.pramod.algorithm.linkedList;

public class LinkedList <T>{

    ListNode headNode;
    public LinkedList(){
        this.headNode = null;
    }

    public void add(int number){
        ListNode listNode = new ListNode(number);
        if(headNode==null){
            headNode = listNode;
        }
        ListNode tempNode = headNode;
        while (tempNode.next!=null){
            tempNode = tempNode.next;
        }

        tempNode.next = listNode;
    }
}
