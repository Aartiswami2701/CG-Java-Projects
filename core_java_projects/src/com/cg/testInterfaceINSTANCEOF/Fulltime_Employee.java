package com.cg.testInterfaceINSTANCEOF;

public class Fulltime_Employee extends Employee1 implements performanceEvaluation{
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
	//Fulltime_Employee fe2=new Employee1();
	@Override
	public void evaluatePerformance() {
		// TODO Auto-generated method stub
		System.out.println("\n"+"id "+id+"\n"+"name "+name+"\n"+"salary  "+salary);
	}
	
}