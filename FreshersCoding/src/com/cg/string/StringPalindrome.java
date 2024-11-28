package com.cg.string;

import java.util.Scanner;

//Determine if a given string is a palindrome 
//(a word, phrase, or sequence that reads the same backward as forward).
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string :");
		String str=sc.next();
		StringBuilder sb= new StringBuilder(str);
		String s=sb.reverse().toString();
		if(str.equals(s)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}

//another logic
/*public static boolean isPalindrome(String input) {
    String reversed = new StringBuilder(input).reverse().toString();
    return input.equals(reversed);
}
*/
