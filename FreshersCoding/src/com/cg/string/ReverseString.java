package com.cg.string;

public class ReverseString {
//Write a method to reverse a given string.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aarti";
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		System.out.println("reversed String: "+sb);
	}

}
//another logic
/*public static String reverseString(String input) {
return new StringBuilder(input).reverse().toString();
}
*/