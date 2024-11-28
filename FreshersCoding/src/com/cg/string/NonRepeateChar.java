package com.cg.string;

import java.util.LinkedHashMap;

import java.util.Map;

//. Find First Non-Repeated Character
//Given a string, find the first non-repeated character in it.

public class NonRepeateChar {
//another logic using map
	public static char firstNonRepeatedChar(String input) {
	    if (input == null || input.isEmpty()) {
	        throw new IllegalArgumentException("Input string must not be null or empty.");
	    }
	    
	    Map<Character, Integer> charCount = new LinkedHashMap<>();
	    
	    // Count occurrences of each character
	    for (char c : input.toCharArray()) {
	        charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	    }
	    
	    // Find the first non-repeated character
	    for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
	        if (entry.getValue() == 1) {
	            return entry.getKey();
	        }
	    }
	    
	    // If no non-repeated character exists
	    throw new RuntimeException("No non-repeated character found.");
	}

	public static void main(String[] args) {
		
		String input = "aarti";
        try {
            char result = firstNonRepeatedChar(input);
            System.out.println("The first non-repeated character is: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
		

		
		// TODO Auto-generated method stub
		/*int[] freq = new int [26];
		String str="aarti";
		str = str.toLowerCase();
		char[] s = str.toCharArray();
		for(char i=0 ; i<s.length ; i++)
		{
			freq[s[i]-'a']++;
		}
		for(int i=0 ; i<str.length() ; i++)
		{
			if(freq[str.charAt(i)-'a']==1)
			{
				System.out.println("First Non repeated character: "+str.charAt(i));
				break;
			}
		}*/
	}

}
