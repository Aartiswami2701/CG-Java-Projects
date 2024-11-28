package com.cg.applicationBook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeReadBook {
	Book[] b1= new Book[4];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] b= new Book[4];
		while(true) {
			System.out.println("Details of Employee :");
			System.out.println("Enter a choice  :");
			System.out.println("1.Add a Book :");
			System.out.println("2.view a Book :");
			System.out.println("3.Update a Book :");
			System.out.println("4.Delete a Book :");
			System.out.println("5.Search a Book :");
			Scanner sc= new Scanner(System.in);
			int ch= sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("enter id: ");
				int id= sc.nextInt();
				System.out.println("enter title: ");
				int title= sc.nextInt();
				System.out.println("enter publisher: ");
				int publisher= sc.nextInt();
				System.out.println("available or not ? (enter in true/false): ");
				int isavailable= sc.nextInt();
				b.write();
				break;
			case 2:
				b.read();
				break;
			case 3:
				b.update();
				break;
			case 4:
				b.delete();
				break;
			case 4:
				b.search();
				break;
			}
			
		}
		
		
		
		public void add() {
		FileWriter fw=null;
		try {
			fw= new FileWriter("book.txt");
			BufferedWriter bw= new BufferedWriter(fw);
			bw.write( b1.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
