package com.cg.stream;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, count how many numbers are greater 
//than a specified threshold using Stream API.
public class GreaterThanThresholdVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1= Arrays.asList(55,33,22,11,66,24,12);
		int thresholdValue=20;
		long l2=l1.stream()
				.filter(x->x>thresholdValue)
				.count();
		System.out.println("count :"+l2);
				
	}

}
