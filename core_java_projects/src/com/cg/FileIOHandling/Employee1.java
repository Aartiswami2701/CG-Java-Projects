package com.cg.FileIOHandling;

import java.io.Serializable;
import java.util.Objects;

public class Employee1 implements Serializable{
	
	protected int id;
	protected String name;

		
	public Employee1(int id, String name) {		
		this.setId(id);
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
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
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	

	}
	



