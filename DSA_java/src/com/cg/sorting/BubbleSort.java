package com.cg.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		  BubbleSort bb = new BubbleSort(); 
	        int arr[] = { 22,44,11,55,66 }; 
	        bb.bubbleSort(arr); 
	        System.out.println("Sorted array"); 
	        bb.print(arr); 
	    
	}
		// TODO Auto-generated method stub
		void bubbleSort(int arr[]) 
	    { 
	        int array = arr.length; 
	        for(int i=0;i<array-1;i++) {
	        	for(int j=0;j<array-i-1;j++) 
	        	{
	        		if(arr[j]>arr[j+1]) 
	        		{
	        			int temp= arr[j];
	        			arr[j]=arr[j+1];
	        			arr[j+1]=temp;					
	        		}
	        	}
	        }
		}

		void print(int arr[]) {
			 int n = arr.length; 
		        for (int i = 0; i < n; ++i) 
		            System.out.print(arr[i] + " "); 
		        System.out.println(); 
		}
		
}
