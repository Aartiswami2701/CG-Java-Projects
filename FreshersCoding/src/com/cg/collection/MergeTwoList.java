package com.cg.collection;
//. Merge Two Sorted Lists
//You are given two sorted lists. Write a program to merge them into a single sorted list.
import java.util.*;
public class MergeTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8);
        
        List<Integer> merged = new ArrayList<>(list1);
        merged.addAll(list2);
        
        Collections.sort(merged);
        
        System.out.println(merged);


	}

}
