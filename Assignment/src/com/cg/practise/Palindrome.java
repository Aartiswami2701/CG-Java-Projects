package com.cg.practise;
import java.util.Scanner;
public class Palindrome {
///assignment no.3
	public static void main(String[] args) {
		//using stringbuilder;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string : ");
		String str=sc.next();
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		
		if(str.equals(sb.toString())) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		/*int rev;
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String :");
		int str=sc.nextInt();
		int temp=str;
		for(int i=0;i>0;i++) {
			rev=str%10;
			sum=(sum*10)+rev;
			str=str/10;
		}
		if(temp==sum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}*/
	}

}
