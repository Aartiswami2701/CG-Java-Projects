package com.cg.exception;

import java.util.Scanner;

//number format exception
public class NumberFormatException {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a Number to get its square ");

		try {
			int a=sc.nextInt();
			System.out.println("Square is : "+a*a);
		}catch(Exception e) {
			System.out.println("Number Format Exception raised..");
		}
	}

}
