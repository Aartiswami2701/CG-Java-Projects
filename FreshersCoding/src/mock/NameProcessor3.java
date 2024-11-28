package mock;

import java.util.*;

public class NameProcessor3 {

    // Method to process names: remove duplicates, sort alphabetically, and convert to uppercase
    public List<String> processNames(List<String> names) {
        // Use a HashSet to remove duplicates (case insensitive)
        Set<String> uniqueNames = new HashSet<>();
        for (String name : names) {
            uniqueNames.add(name.toUpperCase());  // Adding names in uppercase to ensure case insensitivity
        }

        // Convert the Set back to a List
        List<String> processedNames = new ArrayList<>(uniqueNames);

        // Sort the list alphabetically
        Collections.sort(processedNames);

        return processedNames;
    }

    // Method to find the longest name in the list
    public String findLongestName(List<String> names) {
        String longestName = "";
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        return longestName;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        NameProcessor3 nameProcessor = new NameProcessor3();

        // Example input list of names
        List<String> names = Arrays.asList("Rohit", "Anita", "Suresh", "Rohit", "Priya", "anita", "Kumar");

        // Process names
        List<String> processedNames = nameProcessor.processNames(names);
        System.out.println("Processed Names: " + processedNames);

        // Find the longest name
        String longestName = nameProcessor.findLongestName(processedNames);
        System.out.println("Longest Name: " + longestName);
    }
}

//question3:
//
//• Class Variables:
//
//o List<String> names
//
//Class NameProcessor:
//
//• Implement the following methods for this class:
//
//o List<String> processNames(List<String> names): This method takes a list of names,
//
//removes duplicates, sorts them alphabetically, and converts them to uppercase.
//
//▪ Visibility: public
//
//▪ Return Type: List<String>
//
//o String findLongestName(List<String> names): This method takes a list of names and
//
//returns the longest name. If there are multiple names with the same length, return
//
//the first one encountered.
//
//▪ Visibility: public
//
//▪ Return Type: String
//
//Example Input:
//
//["Rohit", "Anita", "Suresh", "Rohit", "Priya", "anita", "Kumar"]
//
//Example Output:
//
//Processed Names: [ANITA, KUMAR, PRIYA, ROHIT, SURESH]
//
//Longest Name: SURESH