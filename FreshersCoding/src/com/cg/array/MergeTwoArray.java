package com.cg.array;
//Merge Two Sorted Arrays
//Write a function that merges two sorted arrays into a single sorted array.

import java.util.Arrays;

/*public class Arrayeg8 {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		int k=0;
		int arr1[]= {2,3,1,4,5};
		int arr2[]= {7,4,5,7,8,9};
		int[] arr3= new int[arr1.length+arr2.length];
		int n=arr1.length;
		int m=arr2.length;
		while(i<n) {
			arr3[k++]=arr1[i++];
		}
		while(j<m) {
			arr3[k++]=arr2[j++];
		}
		Arrays.sort(arr3);
		for(int s=0;s<arr3.length;s++) {
			System.out.println(arr3[s]);
		}
	}
}
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5}; // Sorted array
        int[] arr2 = {4, 5, 7, 8, 9}; // Sorted array

        // Merge and sort the arrays
        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Print the merged array
        System.out.println("Merged Sorted Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        List<Integer> mergedList = new ArrayList<>();

        // Add elements from the first array
        for (int num : arr1) {
            mergedList.add(num);
        }

        // Add elements from the second array
        for (int num : arr2) {
            mergedList.add(num);
        }

        // Sort the merged list
        Collections.sort(mergedList);

        // Convert the list back to an array
        int[] mergedArray = new int[mergedList.size()];
        for (int i = 0; i < mergedList.size(); i++) {
            mergedArray[i] = mergedList.get(i);
        }

        return mergedArray;
    }
}

