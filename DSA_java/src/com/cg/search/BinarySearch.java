package com.cg.search;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		int l=0;
		int h=arr.length-1;
		int mid;
		
		System.out.println("Array Elements : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(+arr[i]);
		}
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number you want to search");
		int j=sc.nextInt();
		while(l<=h) {
			mid=l+(h-l)/2;
			
			if(j>arr[mid]) {
				l=mid+1;
			}
			else if(j<arr[mid]) {
				h=mid-1;
			}
			else {
				System.out.println("Element Found at "+mid);
				return;
			}
		}
	            System.out.println("Element not found in the array.");

	}

}
