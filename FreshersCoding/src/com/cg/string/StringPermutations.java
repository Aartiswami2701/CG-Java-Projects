package com.cg.string;
//Find All Permutations of a String




//Write a method to print all permutations of a given string.

/*public class StringEg10 {
	private static int count = 0;
	public static void findPermutations(String input) {
	    permute(input, "");
	    System.out.println("total permuatation: "+count);
	}

	private static void permute(String input, String result) {
	    if (input.length() == 0) {
	        System.out.println(result);
	        count++;
	        return;
	    }
	    for (int i = 0; i < input.length(); i++) {
	        char c = input.charAt(i);
	        String remainder = input.substring(0, i) + input.substring(i + 1);
	        permute(remainder, result + c);
	    }
	    
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPermutations("aab");
		

	}

}*/








import java.util.ArrayList;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Find All Unique Permutations of a String
// Write a method to print all unique permutations of a given string.

public class StringPermutations {
    public static void findPermutations(String input) {
        Set<String> resultSet = new HashSet<>(); 
        permute(input.toCharArray(), 0, resultSet); 

       
        for (String permutation : resultSet) {
            System.out.println(permutation);
        }

     
        System.out.println("Total unique permutations: " + resultSet.size());
    }

    private static void permute(char[] chars, int index, Set<String> resultSet) {
        if (index == chars.length) {
            resultSet.add(new String(chars)); 
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i); 
            permute(chars, index + 1, resultSet); 
            swap(chars, index, i); 
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp; 
    }

    public static void main(String[] args) {
        findPermutations("abcd"); 
    }
}

