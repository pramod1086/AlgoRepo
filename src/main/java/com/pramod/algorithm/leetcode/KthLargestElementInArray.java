package com.pramod.algorithm.leetcode;

import com.pramod.algorithm.generic.FindKtheElement;

import java.util.stream.IntStream;

public class KthLargestElementInArray {
    public static void main(String args[]) {
        Integer arr[] = { 3,2,3,1,2,4,5,5,6};
        int k = findKthLargestElementInArray(arr,  4);
        System.out.print(k);
    }


    private static int findKthLargestElementInArray(Integer[] arr,int k) {
        return findKthElementByQuickSelect(arr, 0, arr.length-1, 4);
    }

    public static  int	  findKthElementByQuickSelect(Integer[] arr, int left, int right, int k) {
        if (k >= 0 && k <= right - left + 1) {
            int pos = partition(arr, left, right);
            if (pos - left == k) {
                return arr[pos];
            }
            if (pos - left > k) {
                return findKthElementByQuickSelect(arr, left, pos - 1, k);
            }
            return findKthElementByQuickSelect(arr, pos + 1,
                    right, k - pos + left - 1);
        }
        return 0;
    }

    public static int partition(Integer[] arr, int left, int right) {
        int pivot = arr[right];
        Integer[] leftArr;
        Integer[] rightArr;

        leftArr = IntStream.range(left, right)
                .filter(i -> arr[i] < pivot)
                .map(i -> arr[i])
                .boxed()
                .toArray(Integer[]::new);

        rightArr = IntStream.range(left, right)
                .filter(i -> arr[i] > pivot)
                .map(i -> arr[i])
                .boxed()
                .toArray(Integer[]::new);

        int leftArraySize = leftArr.length;
        int rightArraySize = rightArr.length;
        System.arraycopy(leftArr, 0, arr, left, leftArraySize);
        arr[right - rightArraySize] = pivot;
        System.arraycopy(rightArr, 0, arr, left + leftArraySize + 1,
                rightArr.length);

        return right - rightArraySize;
    }

}
