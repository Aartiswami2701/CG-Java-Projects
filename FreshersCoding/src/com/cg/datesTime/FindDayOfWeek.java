package com.cg.datesTime;
//Find Day of the Week for a Given Date

//Write a program that prompts the user to input a date in the format yyyy-MM-dd and
//outputs the day of the week for that date.

import java.time.LocalDate;
import java.util.Scanner;
 
public class FindDayOfWeek {
 
	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		System.out.println("Enter in yyyy-MM-dd format ");
		String s=kb.nextLine();
		LocalDate birthdate = LocalDate.parse(s);//parse input string to birt hdate
		System.out.println(birthdate.getDayOfWeek());
 
	}
 
}
