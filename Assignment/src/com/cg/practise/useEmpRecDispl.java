package com.cg.practise;

public class useEmpRecDispl{
	int id;
	String name;
	double salary;
	public useEmpRecDispl(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void display() {
		System.out.println("id "+id+"name "+name+"salary "+salary);
	}
}