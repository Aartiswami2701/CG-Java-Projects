package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatString {
//Given a list of strings, concatenate them into a single string with a delimiter using Stream API.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1= Arrays.asList("cat","dog","bat");
		String  l2=l1.stream()
				.collect(Collectors.joining(", "));//delimiter is ->,
		System.out.println(l2);
	}

}
