package com.pramod.algorithm.linkedList;

import java.util.Stack;

public class ReverseNodesinkGroup {

    public static void main(String args[])
    {
//        ListNode head = new ListNode(1);
//        ListNode current = head;
//
//        for (int i = 2; i <= 6; i++) {
//            current.next = new ListNode(i);
//            current = current.next;
//        }

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println(reverseKGroup(head,2));
//        System.out.println(reverseKGroupIteration(head,2));
    }

    //this is working fine
    public static ListNode reverseKGroupIteration(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (true) {
            ListNode start = current.next;
            ListNode end = current;

            // Check if there are k nodes remaining
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }

            // If there are fewer than k nodes, no need to reverse
            if (end == null) {
                break;
            }

            // Reverse k nodes
            ListNode prev = null;
            ListNode next = null;

            ListNode tempStart = start; // Save the start of the group for connecting later

            for (int i = 0; i < k; i++) {
                next = start.next;
                start.next = prev;
                prev = start;
                start = next;
            }

            // Connect the reversed part to the previous and next nodes
            current.next = prev;
            tempStart.next = start;

            // Move to the next group
            current = tempStart;
        }

        return dummy.next;


    }

    ///this is working fine
    private static ListNode reverseKGroup(ListNode head,int k) {


        if (head == null || k <= 1) {
            return head;
        }

        int count = 0;
        ListNode current = head;
        ListNode countingNode = head;

        // Count the number of nodes
        while (countingNode != null && count < k) {
            countingNode = countingNode.next;
            count++;
        }

        // If there are fewer than k nodes, no need to reverse
        if (count < k) {
            return head;
        }

        // Reverse the first k nodes
        ListNode prev = null;
        for (int i = 0; i < k; i++) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Recursively reverse the rest of the list
        head.next = reverseKGroup(current, k);

        return prev;
    }



    ///This needs to be fixed

    private static ListNode reverseKGroupUsingStack(ListNode head,int k) {

        ListNode current = head;
        ListNode previous = null;
        while(current!=null){
            Stack stack = new Stack();
            int count= 0;
            while(count<k && current!=null){
                stack.push(current);
                current = current.next;
                count++;

            }

            while(!stack.empty()){

                if(previous==null){
                    previous = (ListNode) stack.pop();
                    head = previous;
                }

                else{
                    previous.next = (ListNode) stack.pop();
                    previous = previous.next;

                }
            }

        }
        previous.next=null;



        return head;


    }


}
