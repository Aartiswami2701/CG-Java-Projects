package com.cg.comparator;

public class Employee1 {
	
	protected int id;
	protected String name;
	int salary;

		
	
	public Employee1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public void display() {
		System.out.println("ID is : "+getId());
		System.out.println("Name is : "+name);	
		System.out.println("salary is : "+salary);
	}


//getid is used for private variables to be ACCESSED outside the class.
	public int getId() {
		return id;
	}
	public void setId(int id)
	{	this.id = id;
	}
	
	

	}
	



