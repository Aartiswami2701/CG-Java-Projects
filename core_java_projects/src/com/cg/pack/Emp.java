package com.cg.pack;

public class Emp {

	private static int idCounter=0;
	private int id;
	double salary;
	public String name;
	
	static {
		System.out.println("Welcome to Capgemini!!");
	}
	
	public Emp(double salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
		this.id=  generateID();
	}
	private static int generateID() {
		return ++idCounter;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
		this.setId(30019372);
		this.name="Aarti";
		this.salary=50000;
	}

	


	public Emp(int id, float salary, String name) {		
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
	




