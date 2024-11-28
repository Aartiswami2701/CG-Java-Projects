package com.cg.array;
//Reverse an Array
//Write a function that reverses the elements of an array.

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,2,5,6,8,9};
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("Array Reverse :"+arr[i]);
		}
		
	}

}
