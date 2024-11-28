package com.cg.collection;
//. Frequency Count of Each Element
//Given a list of integers, count the frequency of each element in the list and print it.

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 3, 4, 4);
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


	}

}
//another approach
/*import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FrequencyCounter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 3, 4, 4);
        
        // List to store unique elements and their counts
        List<Integer> uniqueElements = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        for (int num : list) {
            // Check if the number is already counted
            int index = uniqueElements.indexOf(num);
            if (index != -1) {
                // Increment the count if the number already exists
                counts.set(index, counts.get(index) + 1);
            } else {
                // Add new number and initialize its count
                uniqueElements.add(num);
                counts.add(1);
            }
        }

        // Output the frequency of each element
        for (int i = 0; i < uniqueElements.size(); i++) {
            System.out.println(uniqueElements.get(i) + ": " + counts.get(i));
        }
    }
}
*/