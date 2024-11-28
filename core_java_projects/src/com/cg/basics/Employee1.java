package com.cg.basics;

public class Employee1 {
	
	private int id;
	float salary;
	public String name;
	
	
	
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
		this.setId(30019372);
		this.name="Aarti";
		this.salary=50000;
	}

	


	public Employee1(int id, float salary, String name) {		
		this.setId(id);
		this.salary = salary;
		this.name = name;
	}




	public void display() {
		System.out.println("ID is : "+getId());
		System.out.println("Name is : "+name);
		System.out.println("Salary is : "+salary);
	}


	//can also use tostring() method to display
	@Override
	public String toString() {
		return "Employee1 [id=" + getId() + ", salary=" + salary + ", name=" + name + "]";
	}



//getid is used for private variables to be ACCESSED outside the class.
	public int getId() {
		return id;
	}
	public void setId(int id)
	{	this.id = id;
	}
	
	
	///assignment no.1
	
	public void salaryteam() {
	if(salary>100000) {
		System.out.println("MANAGER");	
		//double manager_sal= 0.03*(salary);
		//System.out.println("bonus on diwali : "+manager_sal);
	}
	else if(salary<100000 && salary>50000) {
		System.out.println("TEAM LEADER");
	}
	else {
		System.out.println("DEVELOPER");
	}
	}
	
	public void Bonus_Salary() {
		double final_sal= 0.03*(salary);
		System.out.println("bonus on diwali : "+final_sal);
		}
	}
	



