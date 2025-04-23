package com.pramod.algorithm.dynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSetSum {

    public static void main(String args[]){
        int arr[] = {8,6,7,5,3,10,9};
        int sum =25;

        List ls = findAllSubsets(arr,sum);
        ls.forEach(System.out::println);


        List second=    isSubsetSum(arr, arr.length, sum);
        second.forEach(System.out::println);

        if (subsetSum(arr, arr.length, sum) != 0) {
            System.out.println("YES\n");
        }
        else
            System.out.println("NO\n");
    }

    private static int subsetSum(int a[], int n, int sum)
    {
        // Storing the value -1 to the matrix
        int tab[][] = new int[n + 1][sum + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                tab[i][j] = -1;
            }
        }

        // If the sum is zero it means
        // we got our expected sum
        if (sum == 0)
            return 1;

        if (n <= 0)
            return 0;

        // If the value is not -1 it means it
        // already call the function
        // with the same value.
        // it will save our from the repetition.
        if (tab[n - 1][sum] != -1)
            return tab[n - 1][sum];

        // If the value of a[n-1] is
        // greater than the sum.
        // we call for the next value
        if (a[n - 1] > sum)
            return tab[n - 1][sum] = subsetSum(a, n - 1, sum);
        else {

            // Here we do two calls because we
            // don't know which value is
            // full-fill our criteria
            // that's why we doing two calls
            if (subsetSum(a, n - 1, sum) != 0
                    || subsetSum(a, n - 1, sum - a[n - 1])
                    != 0) {
                return tab[n - 1][sum] = 1;
            }
            else
                return tab[n - 1][sum] = 0;
        }
    }

    static List<List<Integer>> isSubsetSum(int[] set, int n, int sum)
    {
        // The value of subset[i][j] will be
        // true if there is a subset of
        // set[0..j-1] with sum equal to i
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
                if (i >= set[j - 1])
                    subset[i][j]
                            = subset[i][j]
                            || subset[i - set[j - 1]][j - 1];
            }
        }

        // If the target sum is not possible, return an empty list
        if (!subset[sum][n]) {
            return new ArrayList<>();
        }

        // List to store all the subsets that sum to the target
        List<List<Integer>> result = new ArrayList<>();

        // Function to backtrack and find all subsets
        backtrackGeeks(result, new ArrayList<>(), subset, set, n, sum);

        return result;

    }

    private static void backtrackGeeks(List<List<Integer>> result, ArrayList<Object> objects, boolean[][] subset, int[] set, int n, int sum) {
    }

    static boolean isSubsetSum(ArrayList<Integer> arr, int sum) {
        int n = arr.size();
        // vector to store the current state and previous state
        boolean[] prev = new boolean[sum + 1];
        boolean[] curr = new boolean[sum + 1];

        // Mark prev[0] = true as it is true to make sum = 0
        // using 0 elements
        prev[0] = true;

        // Fill the subset table in bottom up manner
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j < arr.get(i - 1))
                    curr[j] = prev[j];
                else
                    curr[j] = (prev[j] || prev[j - arr.get(i - 1)]);
            }
            prev = curr.clone();
        }

        return prev[sum];
    }

    public static List<List<Integer>> findAllSubsets(int[] a, int targetSum) {
        int n = a.length;

        // Create a DP table to store the subset sum results
        boolean[][] dp = new boolean[n + 1][targetSum + 1];

        // Initialize the dp table (Sum = 0 is always possible)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true; // A sum of 0 is always possible with an empty set
        }

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= targetSum; j++) {
                // If the current element is greater than the current sum, exclude it
                if (a[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Otherwise, check if we can form the sum either by excluding or including the current element
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - a[i - 1]];
                }
            }
        }

        // If the target sum is not possible, return an empty list
        if (!dp[n][targetSum]) {
            return new ArrayList<>();
        }

        // List to store all the subsets that sum to the target
        List<List<Integer>> result = new ArrayList<>();

        // Function to backtrack and find all subsets
        backtrack(result, new ArrayList<>(), dp, a, n, targetSum);

        return result;
    }

    // Backtracking function to find all subsets
    private static void backtrack(List<List<Integer>> result, List<Integer> currentSubset, boolean[][] dp, int[] a, int i, int sum) {
        // If we've processed all elements and sum is 0, add the subset to the result
        if (i == 0 && sum == 0) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }

        // If sum is 0, add the subset to the result
        if (i == 0) {
            return;
        }

        // If excluding the current element results in the sum, recurse on the previous row
        if (dp[i - 1][sum]) {
            backtrack(result, currentSubset, dp, a, i - 1, sum);
        }

        // If including the current element results in the sum, include the element and recurse
        if (sum >= a[i - 1] && dp[i - 1][sum - a[i - 1]]) {
            currentSubset.add(a[i - 1]); // Add current element
            backtrack(result, currentSubset, dp, a, i - 1, sum - a[i - 1]);
            currentSubset.remove(currentSubset.size() - 1); // Backtrack (remove last element)
        }
    }
}

