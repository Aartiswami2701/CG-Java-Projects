package com.cg.array;
//Write a function that takes an array of integers and returns the sum of its elements.
public class sumOfarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {4,5,2,6,2,1};
		int arraySum=0;
		for(int i=0;i<arr.length;i++) {
			arraySum+=arr[i];
		}
		System.out.println("addition of Array : "+arraySum);
		
	}

}
