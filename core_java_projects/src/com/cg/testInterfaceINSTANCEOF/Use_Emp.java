package com.cg.testInterfaceINSTANCEOF;


public class Use_Emp {

	public static void main(String[] args) {
		
		
		System.out.print("\n");
		System.out.println("full time employee details:");
		Fulltime_Employee fe1=new Fulltime_Employee(2,"SWAMI",236000);
		fe1.display();
		
		
		
		System.out.print("\n");
		//checking which interface it  is going to apply as fulltime and parttime both have performance evaluation 
		System.out.print("interface implementation ");
		if(fe1 instanceof performanceEvaluation) {
			((performanceEvaluation)fe1).evaluatePerformance();
		}
		
	}

}
