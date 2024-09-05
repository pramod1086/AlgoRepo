package com.pramod.algorithm.leetcode;

public class ContainerWithMostWater {
    public static void main(String args[])
    {

        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length -1;
        int max = 0;

        while(left<right){
            int leftContainer = height[left];
            int rightContainer = height[right];

            int minArea = Math.min(leftContainer,rightContainer);

            int maxarea = minArea*(right-left);
            max = Math.max(maxarea,max);
            if(leftContainer>rightContainer){
                right--;
            }else {
                left ++;

            }

        }

        return max;

    }
}
