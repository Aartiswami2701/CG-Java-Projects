package com.cg.datesTime;
//Write a Java program that takes a birth date as input in the format yyyy-MM-dd and calculates the 

//current age of the person using the LocalDate class.
import java.time.LocalDate;

import java.time.Period;
import java.util.Scanner;
 
public class CalculateCurrrentAge {
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		//reminder M= capital
		System.out.println("Enter in yyyy-MM-dd format ");
		String s=sc.nextLine();
		LocalDate birthdate = LocalDate.parse(s);//parse input string to birth date
		LocalDate currentdate = LocalDate.now();//parse input string to current date
        Period age=Period.between(birthdate, currentdate);//getting difference between date
        System.out.println(age);
        System.out.println("your age is : "+age.getYears());
	}
 
}
