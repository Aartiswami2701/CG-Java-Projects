package com.cg.collection;
//Remove Duplicates from a List
//Write a program to remove duplicates from a list while preserving the original order
//of the elements.
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);
        Set<Integer> seen = new LinkedHashSet<>(list);
        System.out.println(new ArrayList<>(seen));*/
		
		List<String> list = Arrays.asList("aarti","abhi","jyoti","sandhya","aarti","abhi","jyoti");
        Set<String> seen = new LinkedHashSet<>(list);
        System.out.println(new ArrayList<>(seen));


	}

}
