package com.cg.inherit;


public class Use_Emp {

	public static void main(String[] args) {
		final int X=30;
		//X=10;
		//X=20;
		System.out.print(X);
		// TODO Auto-generated method stub
		System.out.print("\n");
		System.out.println("semployee details:");
		Fulltime_Employee fe=new Fulltime_Employee(1,"a",90000);
		fe.display();
		
		System.out.println(fe instanceof Fulltime_Employee);
		
		//Employee1[] emp=new Employee1[2];
	
		//emp[0]=new Fulltime_Employee(1,"AARTI",200000);
		
		
		System.out.println("full time employee details:");
		Fulltime_Employee fe1=new Fulltime_Employee(2,"aarti",500000);
		fe1.display();
		
		
		System.out.println("part time employee details:");
		//emp[1]=new Parttime_Employee(2,"SWAMI",890000);
		Parttime_Employee fe2=new Parttime_Employee(3,"SHRADDHA",20);
		fe2.display_part();
		
	}

}