package com.cg.array;
//Find the Second Largest Element

//Write a function that finds the second largest element in an array of integers.

/*import java.util.Arrays;
public class ArrayEg5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,1,2,4,6,8};		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}
}*/

//using collection 
import java.util.Arrays;

import java.util.TreeSet;

public class FindSecondLargest {
    
    public static Integer findSecondLargest(Integer[] nums) {
        TreeSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(nums));
        
        if (sortedSet.size() < 2) {
            return null; 
        }

        
        return sortedSet.lower(sortedSet.last());
    }

    public static void main(String[] args) {
        Integer[] nums = {5, 1, 3, 4, 2, 2}; 
        Integer secondLargest = findSecondLargest(nums);
        
        if (secondLargest != null) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("Not enough distinct elements to find the second largest.");
        }
    }
}
