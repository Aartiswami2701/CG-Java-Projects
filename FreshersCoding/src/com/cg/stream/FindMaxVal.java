package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Given a list of integers, use Stream API to find the maximum value.
public class FindMaxVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1= Arrays.asList(9,2,33,5,3,2,1,56,7,88);
		Integer max=l1.stream()
				.map(Integer::intValue)
				.max((e1,e2)->Integer.compare(e1, e2))
				.orElse(null);
		System.out.println("Maximum value among all integers : "+max);

	}

}
