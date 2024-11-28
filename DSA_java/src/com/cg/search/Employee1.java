package com.cg.search;

import java.util.Objects;

public class Employee1 {
	
	protected int id;
	protected String name;

		
	public Employee1(int id, String name) {		
		this.setId(id);
		this.name = name;
	}
	public void display() {
		System.out.println("ID is : "+getId());
		System.out.println("Name is : "+name);	
	}


//getid is used for private variables to be ACCESSED outside the class.
	public int getId() {
		return id;
	}
	public void setId(int id)
	{	this.id = id;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}
	
}



