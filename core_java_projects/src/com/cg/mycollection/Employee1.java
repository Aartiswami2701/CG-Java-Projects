package com.cg.mycollection;

import java.util.HashMap;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class Employee1 {
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}
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
	
	
	public static void main(String[]args) {
		
		HashMap<String,Employee1> ee= new HashMap<String, Employee1>();
		Employee1 e=new Employee1(1,"a");
		Employee1 e1=new Employee1(2,"b");
		
		ee.put("ID11", e);
		ee.put("ID22", e1);
		
		Iterator<Map.Entry<String,Employee1>> im= ee.entrySet().iterator();
		while(im.hasNext()) {
			Map.Entry<String, Employee1>entry=im.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	}
	



