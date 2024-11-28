package com.pro;

import java.util.ArrayList;	
import java.util.Collections;
import java.util.Scanner;

public class Use_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Product p1=new Product(111,"Laptop",90000);
		System.out.println("using default constructor");
		p1.display();
		
		System.out.println("\n");
		System.out.println("first product");
		System.out.println("using parameterized constructor");
		Product p2= new Product(222,"sneakers",7000);
		System.out.println(p2);
		 
		System.out.println("\n");
		System.out.println("second product");
		Product p3=new Product(333,"shoes",9000);
		System.out.println(p3);*/
				
		/*System.out.println("\n");
		System.out.println("total amount of products");
		//double p4= p2.getPrice()+p3.getPrice();
		//System.out.println(p4);
		
		System.out.println("total amount by function");
		//p2.total_price(p3.getPrice());*/
		ArrayList<Product> ar=new ArrayList<>();
		Product p1=new Product(111,"Laptop",90000);
		Product p2=new Product(222,"Mobile",80000);
		Product p3=new Product(333,"mouse",6000);
		ar.add(p1);
		ar.add(p2);
		ar.add(p3);
		
		
		int ch;
		System.out.println("Enter your choice to sort record : ");
		System.out.println("1. SalaryComparator :");
		System.out.println("2. NameComparator :");
		Scanner sc= new Scanner(System.in);
		ch= sc.nextInt();
		sc.close();
		switch(ch){
			case 1:
				
				Collections.sort(ar, new salarycomp());
				System.out.println("\n");
				break;
			case 2:
				
				Collections.sort(ar,new namecomp());
				System.out.println("\n");
				break;
			default:
				System.out.println("invalid");
		}
		System.out.println("Maximum salary :");
		System.out.println(Collections.max(ar,new salarycomp()));
		System.out.println("Minimum salary :");
		System.out.println(Collections.max(ar,new salarycomp()));
		
		System.out.println("\n");
		
		System.out.println("Maximum name :");
		System.out.println(Collections.max(ar,new namecomp()));
		System.out.println("Minimum name :");
		System.out.println(Collections.max(ar,new namecomp()));
		
		
		for(Product a:ar) {
			System.out.println("\n");
			System.out.println(a);
		}
	}

	

}
