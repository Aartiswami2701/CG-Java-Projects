package com.cg.sorting;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectionSort ss= new selectionSort();
		int arr[]= {20,30,1,22,35,0};
		System.out.println("after sorting :");
		ss.print(arr);
		ss.selection(arr);
		System.out.println("after sorting :");
		ss.print(arr);
	}
	public void selection(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}	
			}	
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}	
		}
	public void print(int arr[]) {
		for(int sc:arr) {
			System.out.println(sc);
		}
	}


}
