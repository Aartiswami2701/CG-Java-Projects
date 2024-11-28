package com.cg.exception;

import java.util.Scanner;

public class divideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any two  numbers :");
		int a=sc.nextInt();
		int b= sc.nextInt();
		try {
			System.out.println("result : "+(a/b));
		}catch(ArithmeticException e) {
			System.out.println("error....Divide by zero exception ");
		}
		
		}

}
