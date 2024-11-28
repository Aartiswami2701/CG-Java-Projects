package com.cg.basics;

public class Use_employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee1 e=new Employee1();
			System.out.println("using default constructor");
			e.display();
			
			System.out.println("\n");
			System.out.println("using tostring method");
			System.out.println(e);
			
			System.out.println("\n");
			System.out.println("using parameterized constructor");
			Employee1 e2= new Employee1(222,200000,"Aarti");
			System.out.println(e2);
			e2.salaryteam();
			e2.Bonus_Salary();
			
			e.Bonus_Salary();
			System.out.println("\n");
			System.out.println(e.getId());
			System.out.println(e.name);			
	}

}
