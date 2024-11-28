package com.cg.search;

import java.util.Scanner;

public class BinaryEmp {
	
	private void insert(Employee1[] arr1,int j) {
		// TODO Auto-generated method stub
		int l=0;
		int h=arr1.length-1;
		int mid;
		
		
		while(l<=h) {
			mid=l+(h-l)/2;
			
			if(j>arr1[mid].id) {
				l=mid+1;
			}
			else if(j<arr1[mid].id) {
				h=mid-1;
			}
			else {
				System.out.println("Element Found at "+mid);
				return;
			}
		}
	            System.out.println("Element not found in the array.");

	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 e=new Employee1(1,"Aarti");
		Employee1 e1=new Employee1(2,"Shruti");
		Employee1 e2=new Employee1(3,"Aditi");
		Employee1 e3=new Employee1(4,"Arii");
		Employee1 e4=new Employee1(5,"Shri");
		Employee1 e5=new Employee1(6,"Aiti");
		Employee1[] arr=new Employee1[6];
		arr[0]=e;
		arr[1]=e1;
		arr[2]=e2;
		arr[3]=e3;
		arr[4]=e4;
		arr[5]=e5;
		
		System.out.println("Employee Array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID you want to search");
		int j=sc.nextInt();
		BinaryEmp be= new BinaryEmp();
		be.insert(arr,j);
		
	}


	

}
