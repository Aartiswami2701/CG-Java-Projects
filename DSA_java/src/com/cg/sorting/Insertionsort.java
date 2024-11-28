package com.cg.sorting;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertionsort is=new Insertionsort();
		int arr[] = { 22,44,11,55,66 }; 
        is.insertSort(arr); 
        System.out.println("Sorted array"); 
        is.printInsert(arr);

	}

	public void printInsert(int[] arr) {
		// TODO Auto-generated method stub
		int size = arr.length; 
	        for (int i = 0; i < size; ++i) {
	            System.out.print(arr[i] + " "); }
	        System.out.println(); 
		
	}

	public void insertSort(int[] arr) {
		// TODO Auto-generated method stub
		int size = arr.length; 
		for(int step=1;step<size;step++) {
			int key=arr[step];
			int j=step-1;
			while(j>=0 && key<arr[j])
			{
			arr[j+1]=arr[j];
			--j;
			}
		arr[j+1]=key;
		}	
	}

}
