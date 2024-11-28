package com.cg.array;
//Find the Subarray with Maximum Sum (Kadane's Algorithm)
//Write a function that finds the subarray with the maximum sum from an array of integers
//(can contain both positive and negative numbers).

public class SubarrayWithMaxSum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; 

        int[] result = findMaxSubarray(arr);
        System.out.println("Maximum Sum Subarray: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println("\nMaximum Sum: " + getMaxSum(arr));
    }

    public static int getMaxSum(int[] arr) {
        int maxSoFar = arr[0]; // Initialize to the first element
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static int[] findMaxSubarray(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i; // Start a new subarray
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart; // Update the start index
                end = i; // Update the end index
            }
        }

        // Return the maximum sum subarray
        int[] maxSubarray = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            maxSubarray[i - start] = arr[i];
        }

        return maxSubarray;
    }
}

