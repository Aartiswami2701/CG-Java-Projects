package com.cg.assi;

public class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("name = "+name);
		System.out.println("age = "+age);
	}

	public void makeSound() {
		System.out.println("");
	}
}
