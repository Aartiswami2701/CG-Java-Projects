package com.cg.java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> member= new ArrayList<>();
		member.add("zeoc");
		member.add("jesis");
		member.add("suin");
		member.add("ani");
		
		System.out.println("");
		System.out.println("before stream  ArrayList");
		for(String str:member) {
			System.out.println(str);
		}
		
		System.out.println("");
		System.out.println("after stream  ArrayList");
		member.stream()
			  .filter((s)->s.startsWith("a"))
			  .forEach(System.out::println);
		
		System.out.println("");
		System.out.println("stream  ArrayList using map and uppercase");
		member.stream()
		 // .filter((s)->s.startsWith("a"))
		  .sorted()
		  .map(String::toUpperCase)
		  .forEach(System.out::println);
		
		System.out.println("");
		System.out.println("if any match with 'a' return true");
		boolean result = member.stream()
							   .anyMatch((s)->s.startsWith("a"));
		System.out.println(result);
		
		System.out.println("");
		System.out.println("Using Collectors.. another list return sorted list");
		List<String> nl=member.stream()
							  .sorted()
							  .map(String::toUpperCase)
							  .collect(Collectors.toList());//collector is a terminal operator
		System.out.println(nl);
		
		System.out.println("");
		System.out.println("return count of elements starting with a");
		long l=member.stream()
					 .filter((s)->s.startsWith("a"))
					 .count();
		System.out.println(l);
		
		
		System.out.println("");
		System.out.println("return elements starting with 'a' with all match method");
		boolean result1 = member.stream()
				   .allMatch((s)->s.startsWith("a"));
		System.out.println(result1);
		
	
		System.out.println("");
		System.out.println("return elements starting with 'a' with all match method");
		boolean result2 = member.stream()
				   .noneMatch((s)->s.startsWith("a"));
		System.out.println(result2);
		
		System.out.println("");
		System.out.println("printing distinct element");
		List<Integer> ll=Arrays.asList(1,2,1,2,3,3,4,4);
		ll.stream()
		  .distinct()
		  .forEach(System.out::println);
		
	
		
	
	
	}

}
