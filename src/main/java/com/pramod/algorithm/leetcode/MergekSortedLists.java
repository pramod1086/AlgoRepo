package com.pramod.algorithm.leetcode;

import com.pramod.algorithm.linkedList.ListNode;
import com.pramod.algorithm.linkedList.ListNode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MergekSortedLists {
    public static void main(String args[])
    {
        ListNode[] lists = new ListNode[3];

        ListNode listNode  = new ListNode(1);
        listNode.next = new ListNode(5);
        listNode.next.next = new ListNode(7);

        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(3);
        lists[0].next.next = new ListNode(5);
        lists[0].next.next.next = new ListNode(7);
        lists[1] = new ListNode(2);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(6);
        lists[1].next.next.next = new ListNode(9);

        lists[2] = new ListNode(4);
        lists[2].next = new ListNode(8);
        lists[2].next.next = new ListNode(10);
        MergekSortedLists mergekSortedLists = new MergekSortedLists();
       ListNode node1= mergekSortedLists.mergeKLists(lists);
        System.out.println(lists.length);
    }

    //Using Heap
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode listNode ;
        if(lists.length==0){
            return null;
        }

        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<ListNode>(lists.length, (a, b)->Integer.compare(a.val,b.val));
        for(ListNode node:lists){
            if(node!=null){
                priorityQueue.add(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (!priorityQueue.isEmpty())
        {
            ListNode node = priorityQueue.poll();
            if(node.next!=null){
                priorityQueue.add(node.next);
            }
            dummy.next = node;
            dummy = node;
        }


        return head.next;


    }
//Merge K sorted linked lists using Divide and Conquer:
    public ListNode mergeKListsDC(ListNode[] lists) {
return null;
    }
}
