package com.pramod.competetiveprogramming;

public class MedianofTwoSortedArrays {
    public static void main(String args[]){
        int [] nums1 = {1,2};
        int []nums2 = {3,4};
        double d = findMedianSortedArrays(nums1,nums2);
        System.out.println(d);

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int firstLength = nums1.length;
        int secondLength =  nums2.length;
        double result=0;
        int i=0 ,k = 0;
        int j=0;

        int total = firstLength+secondLength;

        int medium = total/2;;

        boolean isEven = false;

        if(total%2==0){
            isEven = true;
        }

        int [] num3=new int[total];


        while(i<firstLength && j<secondLength && k<=medium){

            if (nums1[i] < nums2[j])
                num3[k++] = nums1[i++];
            else
                num3[k++] = nums2[j++];

        }
        while(i<firstLength && k<=medium){
            num3[k++] = nums1[i++];
        }
        while(j<secondLength && k<=medium){
            num3[k++] = nums2[j++];
        }
        if(isEven){
            int m1 = total/ 2;
            int m2= m1-1;
            Double firstValue = (double) num3[m1];
            Double secondValue = (double) num3[m2];
            result = ( firstValue+secondValue)/2;
        }
        else {
             result = num3[medium];
        }

        return result;


    }

}
