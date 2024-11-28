package com.cg.myexception;

public class throwException {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int age=51;
			checkAge(age);
		}catch(ArithmeticException e) {
			System.out.println("Exception caught " +e.getMessage());
		}catch(RuntimeException e1) {
			System.out.println("Exception caught " +e1.getMessage());
		}
	}
	public static void checkAge(int age) throws ArithmeticException,RuntimeException {
		if(age<18) {
			throw new ArithmeticException("not eligible"); 	
		}	
		else {
			System.out.println("eligible");
		}
		if(age>50) {
			throw new RuntimeException("not eligible"); 	
		}	
		else {
			System.out.println("eligible");
		}
	}

}
