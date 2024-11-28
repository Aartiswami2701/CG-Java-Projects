package com.cg.pack;

import java.util.Scanner;
public class Use_Emp {
	static {
		System.out.println("Hii Aarti");}

	public static void main(String[] args) {
			System.out.println("\n");
			System.out.println("implementation of scanner");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first name ");
			String First_name =sc.nextLine();
			
			System.out.println("Enter last name ");
			String Last_name =sc.nextLine();
			
			System.out.println("Enter birth year ");
			int Birth_year=sc.nextInt();
			
			System.out.println("first name : "+First_name);
			System.out.println("last name : "+Last_name);
			System.out.println("birth year : "+Birth_year);
		
		
		// TODO Auto-generated method stub
			System.out.println("\n");
			System.out.println("implementation of static");
			Emp emp1=new Emp(70000,"swami");
			System.out.println(emp1);
			Emp emp2=new Emp(90000,"aaaa");
			System.out.println(emp2);
			
			System.out.println("\n");
			Emp e=new Emp();
			System.out.println("using default constructor");
			e.display();
			
			System.out.println("\n");
			System.out.println("using tostring method");
			System.out.println(e);
			
			System.out.println("\n");
			System.out.println("using parameterized constructor");
			Emp e2= new Emp(222,200000,"Aarti");
			System.out.println(e2);
			e2.salaryteam();
			e2.Bonus_Salary();
			
			//e.Bonus_Salary();
			System.out.println("\n");
			//System.out.println(e.getId());
			//System.out.println(e.name);
			
			
			
	}
	

}
