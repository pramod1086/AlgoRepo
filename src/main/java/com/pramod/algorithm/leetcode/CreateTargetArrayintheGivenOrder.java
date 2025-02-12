package com.pramod.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CreateTargetArrayintheGivenOrder {

    public static void main(String args[])
    {

        int [] nums =  {1,2,3,4,0};

        int [] index = {0,1,2,3,0};
        Arrays.stream(new CreateTargetArrayintheGivenOrder().createTargetArray(nums,index)).forEach(System.out::println);
        Arrays.stream(new CreateTargetArrayintheGivenOrder().createTargetArrayUsingList(nums,index)).forEach(System.out::println);
        Arrays.stream(new CreateTargetArrayintheGivenOrder().createTargetArrayUsingMap(nums,index)).forEach(System.out::println);

    }

    public int[] createTargetArray(int[] nums, int[] index) {
        int length = index.length;
        int [] target = new int[length];

        Arrays.fill(target,-1);

        for(int i=0;i<length;i++){
            int indexElement = index[i];
            int ifElementPresent =  target[indexElement] ;
            if(ifElementPresent!=-1){
                int startingIndexforMovement = length-1;
                while(startingIndexforMovement>=indexElement && startingIndexforMovement>0){
                    target[startingIndexforMovement] =  target[startingIndexforMovement-1];
                    startingIndexforMovement--;
                }
            }
            target[indexElement]=nums[i];


        }

        return target;

    }

    public int[] createTargetArrayUsingList(int[] nums, int[] index) {
        ArrayList<Integer>tar=new ArrayList<Integer>();
        int[] target =new int[nums.length];

        Arrays.fill(target,-1);
        for(int i=0;i<nums.length;i++){
            //for(int j=0;j<index.length;j++){
            tar.add(index[i],nums[i]);

        }
        for(int i=0;i<tar.size();i++){
            target[i]=tar.get(i);
        }
        return target;
    }

    public int[] createTargetArrayUsingMap(int[] nums, int[] index) {
        Map<Integer,Integer>  ms = new HashMap();
        int[] target =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ms.put(index[i],nums[i]);
        }

        for(Map.Entry<Integer,Integer> entry : ms.entrySet()){

            int indexvalue = entry.getKey();

            int indexindexvaluetoBe = entry.getValue();

            target[indexvalue]=indexindexvaluetoBe;


        }

        return target;


        }






}
