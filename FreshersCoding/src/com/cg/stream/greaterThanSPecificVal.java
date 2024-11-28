package com.cg.stream;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;

//Given a list of integers, find the first element greater than a specified value using Stream API.
public class greaterThanSPecificVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=Arrays.asList(1,3,22,11,32,15,57,53,24);
		int specify=70;
		Integer l2= l1.stream()
				.filter(x-> x>specify)
				.findFirst()
				.orElse(null);
		System.out.println(l2);
		
		int specify1=20;
		Integer l3= l1.stream()
				.filter(x-> x>specify1)
				.findFirst()
				.orElse(null);
		System.out.println("first :"+l3);
	}

}
