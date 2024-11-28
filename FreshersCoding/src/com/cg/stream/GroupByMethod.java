package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of strings, group them by their length using Stream API.
public class GroupByMethod {

	public static void main(String[] args) {
		List<String>l1= Arrays.asList("Aarti","cat","dogs","Bus");
		List<String> l2=l1.stream()
						  .map(x->x+x.length())
						  .collect(Collectors.toList());
		l2.forEach(System.out::println);
		
		Map<Integer, List<String>> groupedByLength = l1.stream()
														.collect(Collectors.groupingBy(String::length));
		
		System.out.println(groupedByLength);

	}

}
