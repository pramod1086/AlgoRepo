package com.pramod.algorithm.linkedList;

public class LinkedListAddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode lastNode=null;
        int listOneValue =0;
        int ListTwoValue=0;
        int previous =0;

        ListNode list1=l1;
        ListNode list2=l2;

        while(list1!=null || list2!=null){
            int sum = 0;
            if(list1!=null ){
                listOneValue=list1.val;
            }else{
                listOneValue=0;
            }


            if(list2!=null){
                ListTwoValue=list2.val;
            }else{
                ListTwoValue=0;
            }


            sum = listOneValue+ListTwoValue+previous;
            int modulus = sum%10;


            if(modulus==0){
                previous=1;
                sum=0;
            }else{
                previous =0;
            }
            //  System.out.println(sum);

            // result.val=sum;

            //ListNode nxt = new ListNode();
            ListNode newNode = new ListNode(sum);




            list1=list1.next;
            list2=list2.next;



        }

        return result;




    }

}
