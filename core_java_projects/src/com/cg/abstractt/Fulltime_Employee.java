package com.cg.abstractt;

public class Fulltime_Employee extends Employee1{
	double salary;
		// TODO Auto-generated method stub

	Fulltime_Employee(int id,String name, double salary) {
		super(id,name);
		this.salary=salary;
	}
	public void display() {
		super.display();
		System.out.println("salary "+salary);
	}
	@Override
	public double CalculateSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	
}