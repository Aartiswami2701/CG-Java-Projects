package com.cg.collection;
//Find Duplicates in an ArrayList
//Given an ArrayList of integers, find and print the duplicates.

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FIndDuplicatesInArrayList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 6);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : list) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println(duplicates);
    }

}
//using stream api
/*import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 6);
        
        // Use Streams to count occurrences and filter duplicates
        List<Integer> duplicates = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1) // Keep only duplicates
            .map(Map.Entry::getKey) // Get the duplicate numbers
            .collect(Collectors.toList());

        System.out.println(duplicates);
    }
}
*/