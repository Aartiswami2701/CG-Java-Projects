package com.cg.testInterfaceINSTANCEOF;

public class Parttime_Employee extends Employee1{
	double hourlyRate;

	public Parttime_Employee(int id, String name, double hourlyRate) {
		super(id,name);
		this.hourlyRate=hourlyRate;
	}
	public void display_part() {
		super.display();
		System.out.println("Hourly Rate: "+hourlyRate);
	}	
}
