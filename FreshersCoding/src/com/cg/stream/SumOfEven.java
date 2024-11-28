package com.cg.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a list of integers, use Stream API to find the sum of all even numbers.
public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum=l1.stream()
				.mapToInt(Integer::intValue)
				.filter(x->x % 2==0)
				.sum();//if you dont use mapToInt then sum method will be undefined
		System.out.println(sum);
		
		/*
			List <Integer>l=new ArrayList<Integer>();
			l.add(10);
			l.add(20);
			l.add(30);
			l.add(40);
			 int sum=l.stream()
					.mapToInt(Integer::intValue)
					.filter(x->(x%2==0))
					.sum();
					System.out.println(sum);

		}*/
				

	}

}
