package StringProblemSolving;
//Reverse Words in a String
//Write a function that reverses the words in a given sentence without changing the order of the words.
//•	Example:
//Input: "I love programming"
//Output: "programming love I"

public class reverseWordsInString {

		    public static void main(String[] args) {
		        String input = "I love programming";
		        String reversed = reverseWords(input);
		        System.out.println(reversed); // Output: "programming love I"
		    }

		    public static String reverseWords(String str) {
		        // Split the string into words
		        String[] words = str.split(" ");
		        
		        // Create a StringBuilder to build the reversed string
		        StringBuilder reversed = new StringBuilder();
		        
		        // Append words in reverse order
		        for (int i = words.length - 1; i >= 0; i--) {
		            reversed.append(words[i]);
		            if (i != 0) { // Avoid adding an extra space at the end
		                reversed.append(" ");
		            }
		        }

		        return reversed.toString();
		    }
		

	}


