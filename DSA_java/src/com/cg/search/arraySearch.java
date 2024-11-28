package com.cg.search;

import java.util.Scanner;

public class arraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40};
		System.out.println("Array Elements : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(+arr[i]);
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number you want to search");
		int j=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==j) {
				System.out.println("Element found at location "+i);
				return;
			}
		}
		System.out.println("not found");
		
		}

	}

