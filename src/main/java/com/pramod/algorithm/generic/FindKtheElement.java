package com.pramod.algorithm.generic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindKtheElement {
	
	public static void main(String args[]) {
		int arr[] = { 3,2,1,5,6,4 };
		
		FindKtheElement fs = new FindKtheElement();
		Integer[] result = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
		int k = kthLargest(arr, 0, arr.length-1, 2);
		System.out.print(k);

	}

	public  static int kthLargest(int[] arr, int low,
							int high, int k)
	{
		// find the partition
		int partition = partition(arr, low, high);

		// if partition value is equal to the kth position,
		// return value at k.
		if (partition == k - 1)
			return arr[partition];

			// if partition value is less than kth position,
			// search right side of the array.
		else if (partition < k - 1)
			return kthLargest(arr, partition + 1, high, k);

			// if partition value is more than kth position,
			// search left side of the array.
		else
			return kthLargest(arr, low, partition - 1, k);
	}
	public static int partition(int[] arr, int low,
						 int high)
	{
		int pivot = arr[high], pivotloc = low;
		for (int i = low; i <= high; i++) {
			// inserting elements of less value
			// to the left of the pivot location
			if (arr[i] > pivot) {
				int temp = arr[i];
				arr[i] = arr[pivotloc];
				arr[pivotloc] = temp;
				pivotloc++;
			}
		}

		// swapping pivot to the final pivot location
		int temp = arr[high];
		arr[high] = arr[pivotloc];
		arr[pivotloc] = temp;

		return pivotloc;
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
	    System.arraycopy(leftArr, 0, arr, left, leftArraySize);
	    arr[leftArraySize+left] = pivot;
	    System.arraycopy(rightArr, 0, arr, left + leftArraySize + 1,
	      rightArr.length);
	 
	    return left + leftArraySize;
	}
	
	
	public static int partitionIterative(Integer[] arr, int left, int right) {
	    int pivot = arr[right], i = left;
	    for (int j = left; j <= right - 1; j++) {
	        if (arr[j] <= pivot) {
	            swap(arr, i, j);
	            i++;
	        }
	    }
	    swap(arr, i, right);
	    return i;
	}

	public static int partitionSimple(Integer[] arr, int low,
								int high)
	{
		int pivot = arr[high], pivotloc = low;
		for (int i = low; i <= high; i++) {
			// inserting elements of less value
			// to the left of the pivot location
			if (arr[i] < pivot) {
				int temp = arr[i];
				arr[i] = arr[pivotloc];
				arr[pivotloc] = temp;
				pivotloc++;
			}
		}

		// swapping pivot to the final pivot location
		int temp = arr[high];
		arr[high] = arr[pivotloc];
		arr[pivotloc] = temp;

		return pivotloc;
	}

	public static void swap(Integer[] arr, int n1, int n2) {
	    int temp = arr[n2];
	    arr[n2] = arr[n1];
	    arr[n1] = temp;
	}
}
