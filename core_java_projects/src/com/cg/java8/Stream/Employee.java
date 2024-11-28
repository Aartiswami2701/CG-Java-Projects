package com.cg.java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 

public class Employee {
    private int id;
    private String name;   
    private String department; 
    private double salary;
    private int ratings;
    private String Gender;

    
    
    public Employee(int id, String name, String department, double salary, int ratings, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.ratings = ratings;
		Gender = gender;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getRatings() {
		return ratings;
	}


	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", ratings=" + ratings + ", Gender=" + Gender + "]";
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	


	

   
	
}

