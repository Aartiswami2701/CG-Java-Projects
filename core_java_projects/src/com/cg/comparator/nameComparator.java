package com.cg.comparator;

import java.util.Comparator;

public class nameComparator implements Comparator<Employee1> {
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		//this is regarding to the string class
		return o1.name.compareTo( o2.name);
	}
}
