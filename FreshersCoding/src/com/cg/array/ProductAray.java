package com.cg.array;
//Product of Array Except Self
//Write a function that returns a new array where each element at index i is the product of all
//the numbers in the original array except the one at i. You should solve it without using division
//and in O(n) time.



public class ProductAray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4}; 
        int[] result = productExceptSelf(nums);

        // Print the result
        System.out.print("Product of Array Except Self: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate products of elements to the left of each index
        result[0] = 1; // The product of elements to the left of the first element is 1
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate products of elements to the right of each index
        int rightProduct = 1; // The product of elements to the right of the last element is 1
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct; // Multiply with the right product
            rightProduct *= nums[i]; // Update the right product
        }

        return result; // Return the final result
    }
}

