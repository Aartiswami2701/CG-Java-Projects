package com.cg.abstractt;

public class Parttime_Employee extends Employee1{
	double hourlyRate;
	int hoursWorked;

	public Parttime_Employee(int id, String name, double hourlyRate,int hoursWorked) {
		super(id,name);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	public void display_part() {
		super.display();
		System.out.println("Hourly Rate: "+hourlyRate);
	}
	@Override
	public double CalculateSalary() {
		// TODO Auto-generated method stub
		double partRate= hourlyRate*hoursWorked;
		return partRate;
	}	
}
