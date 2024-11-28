package com.cg.abstractt;


public class Use_Emp {

	public static void main(String[] args) {
		
		System.out.println("final variable implementation");
		final int X=30;
		//X=10;
		//X=20;
		System.out.print(X);
		
		// TODO Auto-generated method stub
		System.out.println("\n");
		System.out.println("employee details:");
		Employee1 fe=new Fulltime_Employee(1,"AARTI",200000);
		fe.display();
		System.out.print("\n");
		
		System.out.println("abstract method implementation");
		double sal=fe.CalculateSalary();
		System.out.println("abstract returned salary "+sal);
		
		System.out.println("\n");
		System.out.println("instance of method implementation");
		System.out.println(fe instanceof Fulltime_Employee);
		
		//Employee1[] emp=new Employee1[2];
	
		//emp[0]=new Fulltime_Employee(1,"AARTI",200000);
		
		System.out.println("\n");
		System.out.println("full time employee details:");
		Fulltime_Employee fe1=new Fulltime_Employee(2,"SWAMI",236000);
		fe1.display();
		
		System.out.print("\n");
		System.out.println("part time employee details:");
		//emp[1]=new Parttime_Employee(2,"SWAMI",890000);
		Parttime_Employee fe2=new Parttime_Employee(3,"SHRADDHA",1000,50);
		System.out.print("\n");		
		fe2.display_part();
		System.out.print("\n");
		System.out.println("abstract method implementation");
		double hrs=fe2.CalculateSalary();
		System.out.println("hourly worked salary : "+hrs);
		
		System.out.print("\n");
		
		
	}

}
