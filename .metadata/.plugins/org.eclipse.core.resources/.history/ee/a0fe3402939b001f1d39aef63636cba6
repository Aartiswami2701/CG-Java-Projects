package mock;

import java.util.*;

class Source {

    public List<Integer> findPermutationIndices(String s, String pattern) {
        List<Integer> result = new ArrayList<>();
        
        // Edge case: If s or pattern is empty or pattern is longer than s, return empty list
        if (s == null || s.length() < pattern.length()) {
            return result;
        }
        
        // Create a frequency array for characters in the pattern
        int[] patternFreq = new int[26];  // assuming the characters are lowercase English letters
        for (char c : pattern.toCharArray()) {
            patternFreq[c - 'a']++;
        }

        // Sliding window approach: Create a frequency array for the current window in s
        int[] windowFreq = new int[26];
        int windowSize = pattern.length();

        // Initialize the first window
        for (int i = 0; i < windowSize; i++) {
            windowFreq[s.charAt(i) - 'a']++;
        }

        // If the first window matches the pattern's frequency, add the start index (0)
        if (Arrays.equals(patternFreq, windowFreq)) {
            result.add(0);
        }

        // Now slide the window through the string
        for (int i = windowSize; i < s.length(); i++) {
            // Add the character at the current position to the window
            windowFreq[s.charAt(i) - 'a']++;

            // Remove the character that is sliding out of the window
            windowFreq[s.charAt(i - windowSize) - 'a']--;

            // If the frequencies match, add the start index of the window
            if (Arrays.equals(patternFreq, windowFreq)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }
}

public class permutations6 {
    public static void main(String[] args) {
        Source source = new Source();
        
        String s = "cbaebabacd";
        String pattern = "abc";
        
        List<Integer> indices = source.findPermutationIndices(s, pattern);
        
        System.out.println("Start indices: " + indices);
    }
}

//Question 6:
//
//You are given a string s and a non-empty string pattern. Your task is to find all start indices in s
//
//where any permutation of pattern appears as a substring.
//
//Implement a Java program to find all such start indices.
//
//Specifications:
//
//1. Class Definitions:
//
//Class Source:
//
//• Implement the following method for this class:
//
//o List<Integer> findPermutationIndices(String s, String pattern): Finds all start indices
//
//in s where any permutation of pattern appears as a substring.
//
//▪ Visibility: public
//
//▪ Return Type: List<Integer>
//
//Sample Input:
//
//String s = "cbaebabacd";
//
//String pattern = "abc";
//
//Sample Output:
//
//[0, 6]