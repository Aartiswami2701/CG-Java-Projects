package com.cg.array;
//Find the Common Elements in Two Arrays

//Write a function to find the common elements between two arrays.

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;

public class CommonElementsInArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        List<Integer> commonElements = findCommonElements(arr1, arr2);
        System.out.println("Common Elements: " + commonElements);
    }

    public static List<Integer> findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> commonList = new ArrayList<>();

        // Add elements of the first array to the HashSet
        for (int num : arr1) {
            set.add(num);
        }

        // Check for common elements in the second array
        for (int num : arr2) {
            if (set.contains(num)) {
                commonList.add(num); // Add to common elements list
            }
        }

        return commonList;
    }
}
//without using collection

/*package com.cg.array;

import java.util.ArrayList;

public class ArrayCommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        int[] commonElements = findCommonElements(arr1, arr2);
        System.out.println("Common Elements: ");
        for (int num : commonElements) {
            if (num != -1) { // To skip -1 which indicates unused slots
                System.out.print(num + " ");
            }
        }
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        // Create an array to hold common elements (maximum size is the length of the smaller array)
        int maxSize = Math.min(arr1.length, arr2.length);
        int[] commonArray = new int[maxSize];
        int index = 0;

        // Nested loops to find common elements
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    // Check if the element is already added to avoid duplicates
                    boolean alreadyExists = false;
                    for (int k = 0; k < index; k++) {
                        if (commonArray[k] == arr1[i]) {
                            alreadyExists = true;
                            break;
                        }
                    }
                    // If it doesn't exist, add it to the common array
                    if (!alreadyExists) {
                        commonArray[index++] = arr1[i];
                    }
                }
            }
        }

        // Resize the array to remove unused slots
        int[] result = new int[index];
        System.arraycopy(commonArray, 0, result, 0, index);

        return result; // Return the array of common elements
    }
}
*/
