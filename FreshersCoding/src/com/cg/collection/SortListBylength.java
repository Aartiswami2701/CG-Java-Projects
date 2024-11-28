package com.cg.collection;
//Sort a List of Strings by Length
//Write a program to sort a list of strings based on their lengths, and 
//if two strings have the same length, sort them lexicographically.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListBylength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> strings = Arrays.asList("arti","swamiiii","cheese","butter","pizza");
        Collections.sort(strings, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });
        System.out.println(strings);


	}

}
//using comparator
/*package com.cg.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CollectionEg1 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("arti", "swamiiii", "cheese", "butter", "pizza");
        
        // Using Comparator.comparing to sort first by length, then lexicographically
        strings.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        
        System.out.println(strings);
    }
}
*/
