package com.cg.string;

import java.util.Arrays;
import java.util.Scanner;

//Write a method that takes a string and counts the number of vowels and consonants.
public class CountVowelsCons {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine(); // Use nextLine() to read the full input
        str = str.toLowerCase();

        Character[] arr = {'a', 'e', 'i', 'o', 'u'}; // Use Character array
        int vowel = 0;
        int cons = 0;

        for (char c : str.toCharArray()) {
            if (Arrays.asList(arr).contains(c)) {
                vowel++;
            } else if (Character.isLetter(c)) {
                cons++;
            }
        }
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + cons);
	}

}
/*public static void countVowelsAndConsonants(String input) {
    int vowels = 0, consonants = 0;
    input = input.toLowerCase();
    for (char c : input.toCharArray()) {
        if ("aeiou".indexOf(c) != -1) {
            vowels++;
        } else if (Character.isLetter(c)) {
            consonants++;
        }
    }
    System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
}
*/
