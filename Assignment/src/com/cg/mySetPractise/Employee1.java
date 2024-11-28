package com.cg.mySetPractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Employee1 {
	
	 int id;
	 String name;
	 double salary;
	 List<Address> a1;
	 
	 public  void addAddress(Address a) {
		 a1.add(a);
	 }

		
	public Employee1(int id, String name,double salary) {		
		this.setId(id);
		this.name = name;
		this.salary=salary;
		this.a1=new ArrayList<>();
	}
	


//getid is used for private variables to be ACCESSED outside the class.
	public int getId() {
		return id;
	}
	
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", a1=" + a1 + "]";
	}


	public void setId(int id)
	{	this.id = id;
	}


	

	
	}
	



