package com.cg.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateInterface ad1=(a,b)->{return (a+b);};
		System.out.println(ad1.add(5, 03));
		CalculateInterface ad=(a,b)->(a+b);
		System.out.println(ad.add(1, 02));
		
		ArrayList<String>al= new ArrayList();
		al.add("Hii ");
		al.add("aarti :) :)");
		al.add("How");
		al.add("are");
		al.add("you?");
		al.forEach((x)->{System.out.print(" "+x);});

	}
}
