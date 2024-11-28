package com.cg.array;
import java.util.Arrays;


//Find the Frequency of Elements

//Write a function that counts the frequency of each element in an array.


		import java.util.HashMap;
		import java.util.Map;

	/*	public class Arrayeg7 {
		    public static void main(String[] args) {
		        int[] arr = {2, 3, 1, 4, 5, 3, 2, 7, 4, 5, 7, 8, 9};

		        // Call the method to count frequencies
		        countFrequencies(arr);
		    }

		    public static void countFrequencies(int[] arr) {
		        // Create a HashMap to store the frequency of each element
		        Map<Integer, Integer> frequencyMap = new HashMap<>();

		        // Count frequencies
		        for (int num : arr) {
		            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		        }

		        // Print the frequency of each element
		        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    }
		}
*/
		
		//another solution 

		public class FIndFrequency {
		    public static void main(String[] args) {
		        int[] arr = {2, 3, 1, 4, 5, 3, 2, 7, 4, 5, 7, 8, 9};

		        // Call the method to count frequencies
		        countFrequencies(arr);
		    }

		    public static void countFrequencies(int[] arr) {
		        int n = arr.length;
		        boolean[] counted = new boolean[n]; // To keep track of counted elements

		        for (int i = 0; i < n; i++) {
		            if (!counted[i]) { // Only count if not already counted
		                int count = 1; // Start count for the current element
		                for (int j = i + 1; j < n; j++) {
		                    if (arr[i] == arr[j]) {
		                        count++;
		                        counted[j] = true; // Mark as counted
		                    }
		                }
		                System.out.println(arr[i] + ": " + count);
		            }
		        }
		    }
		}

	