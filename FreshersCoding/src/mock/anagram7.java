package mock;

import java.util.*;

class AnagramGroups {

    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to store sorted strings as keys, and list of anagrams as values
        Map<String, List<String>> map = new HashMap<>();
        
        // Iterate through the array of strings
        for (String str : strs) {
            // Convert the string to a char array, sort it, and then convert back to a string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            // If the sorted string is not yet a key, create a new list
            map.putIfAbsent(sortedStr, new ArrayList<>());
            // Add the original string to the list corresponding to the sorted string
            map.get(sortedStr).add(str);
        }

        // Return the values of the map, which are the lists of anagrams
        return new ArrayList<>(map.values());
    }
}

public class anagram7 {
    public static void main(String[] args) {
        AnagramGroups ag = new AnagramGroups();
        
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        List<List<String>> result = ag.groupAnagrams(strs);
        
        // Printing the result
        System.out.println(result);
    }
}

//Question 7:
//
//Given an array of strings, group anagrams together. An anagram is a word or phrase formed
//
//by rearranging the letters of a different word or phrase, typically using all the original letters
//
//exactly once.
//
//Implement a Java program to group the anagrams together.
//
//Specifications:
//
//1. Class Definitions:
//
//Class AnagramGroups:
//
//• Implement the following method for this class:
//
//o List<List<String>> groupAnagrams(String[] strs): Groups anagrams
//
//together from the input array of strings.
//
//▪ Visibility: public
//
//▪ Return Type: List<List<String>>
//
//Sample Input
//
//String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
//
//Sample Output
//
//[ ["ate", "eat", "tea"], ["nat", "tan"], ["bat"]]