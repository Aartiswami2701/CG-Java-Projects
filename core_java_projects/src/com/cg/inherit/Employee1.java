package com.cg.inherit;
//serializable is marker interface = marker interface does not have anything
import java.io.Serializable;

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
	public int hashCode() {
		return Objects.hash(id, name);
	}

	

	}
	



