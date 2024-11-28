package com.cg.stream;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, convert each string to uppercase using Stream API.
public class ConvertToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=Arrays.asList("aarti","swami","jyoti");
		List<String> l2=l1.stream()
						.map(String::toUpperCase)
						.collect(Collectors.toList());
		l2.forEach(System.out::println);

	}

}
