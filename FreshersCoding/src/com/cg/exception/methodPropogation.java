package com.cg.exception;
//Write a program that demonstrates exception propagation by calling a method that throws an 
//unchecked exception and handling it in the calling method.
public class methodPropogation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divideByZero();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

	private static void divideByZero() {
		// TODO Auto-generated method stub
		divideZero();
	}

	private static void divideZero() {
		// TODO Auto-generated method stub
		int x=10/0;
	}

}
