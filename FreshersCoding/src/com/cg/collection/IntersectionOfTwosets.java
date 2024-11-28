package com.cg.collection;
//Find Intersection of Two Sets
//Write a program to find the intersection of two sets of integers.
import java.util.*;
public class IntersectionOfTwosets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
        
        set1.retainAll(set2);
        
        System.out.println(set1);


	}

}
