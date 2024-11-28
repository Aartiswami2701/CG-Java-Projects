//String Compression
//Write a function that compresses a string such that consecutive occurrences of the
//same character are replaced by the character followed by the count of repetitions.
//•	Example:
//Input: "aabcccccaaa"
//Output: "a2b1c5a3"

package StringProblemSolving;
import java.util.*;
public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabcccccaaa";
        String compressed = compressString(input);
        System.out.println(compressed); 
    }

	public static String compressString(String str) {
		 Map<Character, Integer> frequencyMap = new HashMap<>();
	        
		 for (char ch : str.toCharArray()) {
	            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
	        }

	        StringBuilder compressed = new StringBuilder();
	        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
	            compressed.append(entry.getKey());
	            compressed.append(entry.getValue());
	        }

	        return compressed.toString();
	    
	}
	}


