package com.pramod.algorithm.leetcode;


public class SearchinRotatedSortedArray {
    public static void main(String args[])
    {
        int [] num = {1};
        int target = 0;
        SearchinRotatedSortedArray searchinRotatedSortedArray = new SearchinRotatedSortedArray();
        System.out.println(searchinRotatedSortedArray.search(num,target));

    }
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            // check if the current element is target
            if(nums[mid] == target)
                return mid;
                // if the starting index of the search space has smaller element than current element
            else if(nums[low]<=nums[mid]){
                // if target lies in non-rotated search space (or subarray)
                if(target >= nums[low] && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                // if target lies in non-rotated subarray
                if(target>nums[mid] && target<=nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        // if you couldn't find the target element until now then it does not exists
        return -1;


    }

    public int searchRecursion(int[] nums, int target) {
        int start =0;
        int end = nums.length;

        int value = binarySearch(nums,start,end-1,target);
        return value;

    }
    public int binarySearch(int[] nums,int left,int right, int target) {
        if (left < left) {
            int mid = left + (right - left) / 2;
            if( nums[mid] == target){
                return mid;
            }

            // Case 2: subarray on mid's left is sorted
            else if (nums[mid] >= nums[left]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                    return binarySearch( nums, left, right,  target) ;
                } else {
                    left = mid + 1;
                    return binarySearch( nums, left, right,  target) ;
                }
            }

            // Case 3: subarray on mid's right is sorted
            else {
                if (target <= nums[right] && target > nums[mid]) {
                    left = mid + 1;
                    return binarySearch( nums, left, right,  target) ;
                } else {
                    right = mid - 1;
                    return binarySearch( nums, left, right,  target) ;
                }
            }
        }
      return -1;

    }
}
