package com.pramod.algorithm.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubSetSum {

    static List<List<Integer>> result = new LinkedList<>();
    public static void main(String args[]){
//        int arr[] = {8,6,7,5,3,10,9};
//        int sum =15;

        int arr[] = { 2, 3, 6, 7};

        int sum  = 7;


        List<List<Integer>> result = findTargetSumSubsets(arr, sum);
        System.out.println("Subsets with target sum " + sum + ": " + result);
        List<Integer> result1 = constructSubset(arr, sum,arr.length);
        System.out.println("Subsets with target sum result1 " + sum + ": " + result1);
//       List ls =  constructSubset(arr,sum,arr.length-1);
//        System.out.println(ls);
//
//        List list = new ArrayList();
//      //  constructAllSubset(0, n1, set1, sum1, subset1);
//        constructAllSubset(arr,sum,arr.length-1,list);
//        System.out.println(list);
//        result.stream().forEach(element->{
//            System.out.println(element);
//        });
    }

    // Finds all subsets whose sum equals the target
    public static List<List<Integer>> findTargetSumSubsets(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, target, 0, new ArrayList<>(), result);
        return result;
    }
    private static boolean subSetSum(int[] arr, int sum, int n) {
        boolean subset[][] = new boolean[sum + 1][n + 1];

        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++)
            subset[0][i] = true;

        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i <= sum; i++)
            subset[i][0] = false;

        // Fill the subset table in bottom
        // up manner
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= arr[j - 1])
                    subset[i][j] = subset[i][j]
                            || subset[i - arr[j - 1]][j - 1];
            }
        }

        /* // uncomment this code to print table
        for (int i = 0; i <= sum; i++)
        {
        for (int j = 0; j <= n; j++)
            System.out.println (subset[i][j]);
        } */

        return subset[sum][n];
    }

        private static boolean subSetSumRecursive(int[] arr, int sum, int length) {
        if(sum==0){
            return true;
        }
        if(sum<0){
            return false;

        }

        if(length==0){
            return false;
        }
        if (arr[length - 1] > sum)
            return subSetSumRecursive(arr, length - 1, sum);

        /* else, check if sum can be obtained
        by any of the following
            (a) including the last element
            (b) excluding the last element */
        return subSetSumRecursive(arr, sum,length - 1)
                || subSetSumRecursive(arr, sum - arr[length - 1],length - 1);

    }
    private static List<Integer> constructSubset(int[] arr, int sum, int length) {
        if(sum==0){
            return new ArrayList<>();
        }
        if(sum<0){
            return null;

        }

        if(length<0){
            return null;
        }
        List<Integer>  Y = constructSubset(arr,sum,length-1);
        if (Y != null) {
            return Y; // Subset found without including X[i]
        }
        Y = constructSubset(arr,sum-arr[length],length-1);
        if (Y != null) {
            Y.add(arr[length]); // Add the current element X[i] to the subset
            return Y;
        }

        // If no subset is found, return null
        return null;
    }

    private static void  constructAllSubset(int[] arr, int sum, int length,List<Integer> subset) {

        if (sum == 0) {
            // Prints a valid subset
            result.add(new ArrayList<>(subset));
          //  result.add(subset);
//            System.out.print("[ ");
//            for (int j = 0; j < subset.size(); j++) {
//                System.out.print(subset.get(j) + " ");
//            }
//            System.out.print("]");
            return;
        }


        if(sum<0){
            return ;

        }

        if(length<0){
            return ;
        }
        constructAllSubset(arr,
                sum,length- 1, subset);
        if (arr[length] <= sum) {
            // Push the current element in the subset
            subset.add(arr[length]);

            // Recursive call for considering the current
            // element
            constructAllSubset(arr,
                    sum - arr[length],length- 1, subset);



            System.out.println("Backtrack (remove): " + subset.get(subset.size() - 1));

            // Pop-back element after the recursive call to
            // restore the subset's original configuration
             subset.remove(subset.size() - 1);
        }
        return ;
    }

    private static void backtrack(int[] nums, int target, int start, List<Integer> current, List<List<Integer>> result) {
        // Base case: exact match
        if (target == 0) {
            result.add(new ArrayList<>(current)); // Add a copy of current list
            return;
        }

        // Try all candidates starting from 'start' index
        for (int i = start; i < nums.length; i++) {
            // Skip if number is greater than remaining target
            if (nums[i] > target) continue;

            // Choose the number
            current.add(nums[i]);

            // Explore further with reduced target (can reuse current number)
            backtrack(nums, target - nums[i], i, current, result);
            System.out.println("Backtrack (remove): " + current.get(current.size() - 1));
            // Backtrack: remove the number and try next
            current.remove(current.size() - 1);
        }
    }


}
