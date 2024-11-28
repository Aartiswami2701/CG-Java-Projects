package com.cg.java8.funinterfc;
@FunctionalInterface
	

public interface myInterface {
	public void display() ;
	//implementing functional interface
	default void diwali() {
		System.out.println("enjoy diwali");
	}
}
