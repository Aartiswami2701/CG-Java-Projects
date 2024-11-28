package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, use Stream API to remove duplicates and return the list sorted
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>l1= Arrays.asList("Aarti","cat","dogs","Bus","cat","yes");
		List<String> l2=l1.stream()
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		l2.forEach(System.out::println);

	}

}
