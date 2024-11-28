package com.cg.equal;

public class useEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp1=new Employee1(1,"Aarti");
		Employee1 emp2 =new Employee1(1,"Aarti");
		Employee1 emp3 =new Employee1(1,"Aarti");
		emp1.display();
		emp2.display();
		
		emp2=emp1;
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));
		System.out.println(emp2);
		if(emp1==emp2) {
			System.out.println("right true");
		}
		
	}

}
