package com.pramod.algorithm.linkedList;

public class MiddleOfLinkedList {
    public ListNode findMiddle(ListNode head) {
        // If the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize two pointers, slow and fast
        ListNode slow = head;
        ListNode fast = head;

        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // When fast reaches the end, slow is at the middle
        return slow;
    }

    // Helper function to print the list
    public void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example usage:
        MiddleOfLinkedList list = new MiddleOfLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        list.printList(head);

       // ListNode middleNode = list.findMiddle(head);

        ListNode middle = list.findMiddleLinkedList(head);
        System.out.println("Middle node: " + middle.val);


    }
    public ListNode findMiddleLinkedList(ListNode head) {

        ListNode current = head;

        int count =0;

        while(current.next!=null){
            count++;

            current= current.next;

        }

        int mid_index = count / 2;

        while(mid_index > 0){
            head = head.next;
            mid_index --;
        }

        return head;




    }


}
