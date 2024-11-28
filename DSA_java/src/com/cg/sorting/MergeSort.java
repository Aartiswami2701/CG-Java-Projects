package com.cg.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 38,27,43,3,9,82,10 }; 
		System.out.println("Given Array");
        print(arr);
		// TODO Auto-generated method stub
		
		mergeSort(arr);
		System.out.println("Sorted Array");
		print(arr);
		
		
		
	}
	public static void mergeSort(int[]arr) {
		if(arr.length<2) {
			return;
		}
		int mid=arr.length/2;
		int[] left= new int[mid];
		int[] right= new int[arr.length-mid];
		System.arraycopy(arr, 0, left, 0, mid);
		System.arraycopy(arr, mid, right, 0, arr.length-mid);
		mergeSort(left);
		mergeSort(right);
		merge(arr,left,right);
	}
	
	
	public static void merge(int[] arr,int[]left , int[]right) {
		int leftindex=0;
		int rightindex=0;
		int arrayIndex=0;
		while(leftindex<left.length && rightindex<right.length) {
			System.out.println();
			if(left[leftindex]<=right[rightindex]) {
				
				arr[arrayIndex++]=left[leftindex++];
			}
			else {
				arr[arrayIndex++]=right[rightindex++];
			}
		}
		
		while(leftindex<left.length) {
			arr[arrayIndex++]=left[leftindex++];
		}
		while(rightindex<left.length) {
			arr[arrayIndex++]=right[rightindex++];
		}
	}
	
	
	static void print(int arr[]) {
		 int n = arr.length; 
		 
	        for (int i = 0; i < n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	}

}
