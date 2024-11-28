package com.cg.collection;
//Find Kth Largest Element in a List
//Given a list of integers, find the Kth largest element in the list
import java.util.*;
public class FIndKElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list = Arrays.asList(3, 2, 1, 5, 6, 4);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter kth location : ");
        int k = sc.nextInt();
        
        Collections.sort(list, Collections.reverseOrder());
        
        System.out.println(k + "th largest element: " + list.get(k - 1));


	}

}
