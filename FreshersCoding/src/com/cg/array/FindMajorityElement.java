package com.cg.array;
//Find the Majority Element
//A majority element is an element that appears more than n/2 times in an array of size n.
//Write a function to find the majority element. If no such element exists, return -1.



public class FindMajorityElement {

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majorityElement = findMajorityElement(arr);
        
        if (majorityElement != -1) {
            System.out.println("Majority Element: " + majorityElement);
        } else {
            System.out.println("No Majority Element");
        }
    }

    public static int findMajorityElement(int[] arr) {
        int candidate = -1;
        int count = 0;

        // First pass: Find a candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num; 
            }
            count += (num == candidate) ? 1 : -1; // Increment or decrement count
        }

        // Second pass: Verify the candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if the candidate is indeed a majority element
        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1; 
        }
    }
}

