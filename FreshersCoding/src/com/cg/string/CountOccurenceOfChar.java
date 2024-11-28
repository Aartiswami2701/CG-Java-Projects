package com.cg.string;

import java.util.HashMap;
import java.util.Map;

//Count Occurrences of Each Character
//Write a method that counts the occurrences of each character in a string.

/*public class CountOccurenceOfChar {
	public static void countCharOccurrences(String input) {
	    Map<Character, Integer> occurrences = new HashMap<>();
	    for (char c : input.toCharArray()) {
	        occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
	    }
	    for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
	        System.out.println(entry.getKey() + ": " + entry.getValue());
	    }
	}

	public static void main(String[] args) {
		
		countCharOccurrences("shubham");
	}

}*/
//another logic


//Count Occurrences of Each Character
//Write a method that counts the occurrences of each character in a string.







// Count Occurrences of Each Character
// Write a method that counts the occurrences of each character in a string.

public class CountOccurenceOfChar {
        // Assuming input contains only ASCII characters
    	public static void main(String []args)
		{
	        String str = "shubham";
	        char[] arr = str.toCharArray();
	        boolean[] printed = new boolean[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            if (printed[i]==false) { 
	                int count = 0;
	                for (int j = 0; j < arr.length; j++) {
	                    if (arr[i] == arr[j]) {
	                        count++;
	                        printed[j] = true; 
	                    }
	                }
	                System.out.print(arr[i] + ":" + count);
	            }
	        }
	    }
}

