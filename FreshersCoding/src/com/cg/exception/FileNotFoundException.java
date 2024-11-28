package com.cg.exception;

import java.io.File;


import java.util.Scanner;

//Write a program to read data from a file. 
//If the file is not found, handle the FileNotFoundException.
public class FileNotFoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f= new File("output.txt");
			Scanner sc= new Scanner(f);
			//f.write("hi");
			while(sc.hasNextLine()) {
				System.out.println(sc.hasNextLine());
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
