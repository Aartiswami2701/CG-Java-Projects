package com.cg.collection.comparable;

import java.util.ArrayList;

import java.util.Collections;

import com.cg.equal.Employee1;

public class useemployee1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> ar=new ArrayList<>();
		Employee1 emp1=new Employee1(2,"shubham",90000);
		Employee1 emp2 =new Employee1(1,"Aarti",78888);
		Employee1 emp3 =new Employee1(4,"yash",67488);
		Employee1 emp4 =new Employee1(3,"som",18888);
		ar.add(emp1);
		ar.add(emp2);
		ar.add(emp3);
		ar.add(emp4);
		
		Collections.sort(ar);
		
		for(Employee1 a:ar) {
			System.out.println(a);
		}	
	}
}