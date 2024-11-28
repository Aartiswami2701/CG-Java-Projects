package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, return a list containing the square of each element using Stream API.
public class SquareInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=Arrays.asList(2,4,3,1,5);
		List<Integer> l2=l1.stream()
				//.filter(x->Math.pow(x,x))//instead of using filter use map
				.map(x->x*x)
				.collect(Collectors.toList());
		l2.forEach(System.out::println);
	}

}
