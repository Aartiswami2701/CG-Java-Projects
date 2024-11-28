package com.cg.java8.funinterfc;

public class TestMyInterface implements myInterface{
	public static void main(String args[]) {
		TestMyInterface t= new TestMyInterface();
		t.display();
		t.diwali();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hi functional Interace");
	}
	
	
}
