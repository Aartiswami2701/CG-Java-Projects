package com.cg.exception;

import java.util.Scanner;

//Create a custom exception class InvalidAgeException that is thrown 
//when the user tries to enter an age less than 18 or greater than 100.



public class CustomException {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter age of an user ");
			int age= sc.nextInt();
			if(age<18 || age>100) {
				throw new InvalidAgeException("User must be above 18 and Below 100");
			}
			System.out.println("eligible for vote");
		}catch(InvalidAgeException e) {
			System.out.println(e);
		}
	}
}

