package com.cg.exception;

import java.util.Scanner;

//Write a program that tries to access a method on a null object and
//handles the NullPointerException.
public class NullExceptionpg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str=null;
		try {
			System.out.println(str.length());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

}
