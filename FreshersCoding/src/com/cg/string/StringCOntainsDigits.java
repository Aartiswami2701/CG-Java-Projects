package com.cg.string;
//Check if a String Contains Only Digits
//Write a method that checks if a string contains only digits.

public class StringCOntainsDigits {
	public static boolean isNumeric(String input) {
	    return input.matches("\\d+");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//returs true
		/*String input = "9089";
        boolean result = isNumeric(input);
        System.out.println("Is input match with digits: " + result);*/
        
		//returns false
        String input = "aarti";
        boolean result = isNumeric(input);
        System.out.println("Is input match with digits: " + result);

	}

}
