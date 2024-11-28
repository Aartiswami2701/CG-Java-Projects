package com.cg.string;

import java.util.Arrays;

//Write a method to check if two strings are anagrams of each other.
public class StringAnagrams {
	public void checkAnagram(String a, String b) {
		String a1= a.toLowerCase();
		String b1= b.toLowerCase();
		
		char arr1[]=a1.toCharArray();
		char arr2[]=b1.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("anagram");
		}else {
			System.out.println("no anagram");
		}
		
	}

	public static void main(String[] args) {
		StringAnagrams ana= new StringAnagrams();
		ana.checkAnagram("Naina", "aaina");
	}

}
