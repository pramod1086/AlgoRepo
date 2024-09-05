package com.pramod.algorithm.linkedList;

public class OddEvenSeggration {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};

        Node head = createList(arr);
        print(head);
        print(solve(head));
    }



    private static Node solve(Node head) {

        if (head == null) {
            return head;
        }
        Node odd = head, even = head.next;
        Node evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;

    }

    public static Node createList(int[] arr){
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1 ; i < arr.length ; i++){
            temp.next=new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println();
    }
}
