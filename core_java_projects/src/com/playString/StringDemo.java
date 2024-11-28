package com.playString;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Aarti";
		str.concat("Swami");
		//only print aarti bcz string is immutable
		System.out.println(str);
		System.out.println(str.concat("Swami"));
		String s1="Apples";
		String s2="aPPleS";
		String s3=new String("Apples");
		//points to same reference s1 and s2
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//bcz new object created s3
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true
		

		System.out.println(s1.compareTo(s2));//0
		String s4="mango";
		System.out.println(s1.compareTo(s4));//negative value 
		System.out.println(s4.compareTo(s1));//positive value alphabetically do this
		
		StringBuilder sb= new StringBuilder("hello");
		System.out.println(sb);
		sb.append(" capgemini");// concat with hello
		System.out.println(sb);
		
		StringBuffer sb1= new StringBuffer("hello");
		sb1.append(" Capgemini");
		System.out.println(sb1);
		
	
		
		System.out.println(s1.length());
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(2, 4));
		System.out.println(s1.charAt(4));
		System.out.println(s1.toLowerCase());
		
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.replace("Apples", "Aaru"));
		String str0= "aarti  ";
		System.out.println(str0.trim());//remove last spaces
		String str11= "aarti is a brave student. she is a capgemini employee";
		str11.split(",");
		System.out.println(str11);
		
		
		
		
		
	}

}
