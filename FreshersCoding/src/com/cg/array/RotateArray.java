package com.cg.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Rotate an Array by K Positions. Write a function that rotates an array by k positions to the right.
//If k = 3, the last 3 elements of the array move to the beginning.

public class RotateArray {

	public static void main(String[] args)
	{
		/*int k = 2;
		int[] arr = {1,2,3,4,5};
		System.out.println("Original Array : ");
		for(int i=0 ; i<arr.length ; i++)
		{	
			System.out.print(arr[i] + " ");
		}
		int[] brr = new int[arr.length];
		for(int i=0 ; i<arr.length ; i++)
		{
			brr[(i+k)%arr.length]=arr[i];
		}
		System.out.println("\nRight Rotated Array : ");
		for(int i=0 ; i<brr.length ; i++)
		{
			System.out.print(brr[i] + " ");
		}
		int[] crr = new int[arr.length];
		for(int i=0 ; i<arr.length ; i++)
		{
			crr[(i-k+arr.length)%arr.length]=arr[i];
		}
		System.out.println("\nLeft Rotated Array : ");
		for(int i=0 ; i<crr.length ; i++)
		{
			System.out.print(crr[i] + " ");
		}*/
		
		

		//using collection

		 
	   Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
	   int k = 3;
	   System.out.println("Original array: " + Arrays.toString(nums));
	   rotate(nums, k);
	   System.out.println("Rotated array: " + Arrays.toString(nums));
		    
		

	}
    public static void rotate(Integer[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than the array length
        
        // Convert array to list
        List<Integer> list = Arrays.asList(nums);
        
        // Rotate the list
        Collections.rotate(list, k);
        
        // Convert list back to array
        list.toArray(nums);
    }

}
