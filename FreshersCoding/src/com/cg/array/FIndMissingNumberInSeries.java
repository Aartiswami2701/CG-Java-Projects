package com.cg.array;
//Find the Missing Number in a Series
//You are given an array containing n-1 integers in the range from 1 to n. 
//There are no duplicates in the array. One number is missing. Find the missing number.



/*public class ArrayEg9 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 2, 8, 4}; // Example input with n = 8 (missing 5)
        int n = 8; // The range is from 1 to n

        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between the expected and actual sum
        return expectedSum - actualSum;
    }
}*/



import java.util.HashSet;

public class FIndMissingNumberInSeries {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 2, 8, 4}; // Example input with n = 8 (missing 5)
        int n = 8; // The range is from 1 to n

        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        // Create a HashSet to store the elements of the array
        HashSet<Integer> numberSet = new HashSet<>();

        // Add all elements to the HashSet
        for (int num : arr) {
            numberSet.add(num);
        }

        // Check for the missing number in the range from 1 to n
        for (int i = 1; i <= n; i++) {
            if (!numberSet.contains(i)) {
                return i; // Return the first missing number found
            }
        }

        return -1; // This line should theoretically never be reached if input is valid
    }
}

