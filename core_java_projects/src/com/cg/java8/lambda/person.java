package com.cg.java8.lambda;

import java.util.ArrayList;

public class person {
	String name;
	int age;
	

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}


	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<person> pl=new ArrayList<person>();
		person p1= new person("aarti",21);
		person p2= new person("shashi",29);
		pl.add(p1);
		pl.add(p2);
		System.out.println("using for each");
		for(person l:pl) {
			System.out.println(l);
		}
		System.out.println("using lambda");
		pl.forEach((p)->{System.out.println(p);});
		
		
		

	}

}
