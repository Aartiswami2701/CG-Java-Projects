package com.cg.basics;

public class Use_datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='i';
		int id=30019372;
		String name="AARTI";
		int age=21;
		double salary=3000000;
		System.out.println("Employee Name : "+name  +"\n"+ "Employee ID : "+id + "\n"+ "Employee Age : "+ age + "\n"+ "Employee salary : "+salary);
		
		System.out.println("\n");
		if(age>18) {
			System.out.println("Adult");
		}
		else if(age<18 && age>14) {
			System.out.println("Teen");
		}
		else {
			System.out.println("Kid");
		}
		
		System.out.println("\n");
		
		switch(ch) {
		case 'a':
			System.out.println("vowel");
		break;
		case 'e':
			System.out.println("vowel");
		break;
		case 'i':
			System.out.println("vowel");
		break;
		case 'o':
			System.out.println("vowel");
		break;
		case 'u':
			System.out.println("vowel");
		break;
		default :
			System.out.println("Not a vowel");		
		}
		
		System.out.println("\n");
		System.out.println("Printing Even Numbers");
		for(int i=2;i<=10;i++) {
			System.out.println(i);
			i++;
		}
		System.out.println("\n");
		
		int j=1;
		while(j<10) {
			
			System.out.println("hey");
			j++;
		}
		System.out.println("\n");
		
		
		
		int k=1;
		do{
			System.out.println("Done");
			k++;
		}while(k<5);
		
		System.out.println("\n");
	}

}
