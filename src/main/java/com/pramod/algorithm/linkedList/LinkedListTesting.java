package com.pramod.algorithm.linkedList;

public class LinkedListTesting {
    public static void main(String[] args) {
        // Example usage:
        MiddleOfLinkedList list = new MiddleOfLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
      //  list.printList(head);

        //ListNode middleNode = list.listTesting(head);

      // System.out.println("Middle node: " + middleNode.toString());


    }
}
