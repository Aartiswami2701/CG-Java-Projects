package com.cg.myexception;

public class Fulltime_Employee{
	double salary;
	public static void display(double salary) throws ArithmeticException{	
		if(salary<0 && salary==0) {
			throw new ArithmeticException("salary cant negative");
		}
	}

	

public static void main(String[] args) {
	try {
		display(-90000);
	}catch(ArithmeticException e) {
		System.out.println("Exception caught " +e.getMessage());
	}
	
}}
