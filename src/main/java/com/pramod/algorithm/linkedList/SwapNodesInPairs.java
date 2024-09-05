package com.pramod.algorithm.linkedList;

public class SwapNodesInPairs {
    public static void main(String args[])
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        //System.out.println(swapNodesInPairs(head));
        //System.out.println(swapNodesInPairsIterative(head));
        swapPairs(head);
        printList(head);
    }

    private static ListNode swapNodesInPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode first = head , second = head.next;
        first.next = swapNodesInPairs(head.next.next);
        second.next = first;
        return second;
    }
    public static ListNode swapNodesInPairsIterative(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        //initialise the prevNode
        ListNode prevNode = new ListNode(-1) , prehead = prevNode;
        prevNode.next = head;
        ListNode firstNode , secondNode , tempNode;

        //temporary variable to store first and second of every pair
        while(head != null && head.next != null)
        {
            firstNode = head;
            secondNode = head.next;
            tempNode = secondNode.next;
            secondNode.next = firstNode;
            prevNode.next = secondNode;
            //connecting previous node to the second of this pair
            prevNode = firstNode;
            head = tempNode;
            //reinitialising previous node and head for next pair
        }
        prevNode.next = head;
        return prehead.next;

    }

    public static ListNode swapPairs(ListNode head) {
        // Create a dummy node to simplify the swapping logic for the head node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Pointer to track the node before the current pair being swapped
        ListNode prevNode = dummy;

        // Traverse the list, swapping nodes in pairs
        while (head != null && head.next != null) {
            // Nodes to be swapped
            ListNode firstNode = head;
            ListNode secondNode = head.next;

            // Swapping the nodes
            prevNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            // Moving the pointers forward
            prevNode = firstNode;
            head = firstNode.next; // Move to the next pair
        }

        // Return the new head of the list
        return dummy.next;
    }

    // Helper function to print the list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

}
