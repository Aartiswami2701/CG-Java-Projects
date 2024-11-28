package com.cg.inherit;

public class Fulltime_Employee extends Employee1{
	double salary;
		// TODO Auto-generated method stub

	
	public void display() {
	super.display();
	System.out.println("salary "+salary);
	}
		public Fulltime_Employee(int id, String name, double salary) {
			super(id, name);
			this.salary = salary;
		}



//	
}