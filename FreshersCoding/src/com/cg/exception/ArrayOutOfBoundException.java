package com.cg.exception;

import java.util.Scanner;
//arrayIndexOutOfBound
public class ArrayOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	int[] arr= {4,5,6,2,1};
	int index;
	try {
		System.out.println("Enter index where element want to be inserted..");
		index= sc.nextInt();
		System.out.print(arr[index]);
	}catch(Exception e) {
		System.out.println(e);
	}
	}

}
