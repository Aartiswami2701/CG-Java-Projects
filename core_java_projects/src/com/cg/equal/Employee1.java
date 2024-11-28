package com.cg.equal;



public class Employee1 implements Comparable<Employee1>{
	
	protected int id;
	protected String name;
	int salary;

	
	public Employee1(int id, String name,int salary) {		
		this.setId(id);
		this.name = name;
		this.salary=salary;
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
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public int compareTo(Employee1 a) {
		// TODO Auto-generated method stub
		/*if(a.salary==this.salary) {
			return 0;
		}
		else if(a.salary>this.salary) {
			return -1;
		}
		else {
		return 1;
		}*/
		
		
		
		/*if(a.name.equals(name)) {
			return 0;
		}
		else {
			return -1;
		}*/
		return (this.name).compareTo(a.name);
	}
	}
	



