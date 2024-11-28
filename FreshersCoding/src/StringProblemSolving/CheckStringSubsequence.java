package StringProblemSolving;
//Check if String is a Subsequence
//Given two strings, check if the first string is a subsequence of the second one.
//•	Example:
//Input: "abc", "ahbgdc"
//Output: true

public class CheckStringSubsequence {
	
	    public static boolean isSubsequence(String s, String t) {
	        int sIndex = 0; // Pointer for the first string
	        int tIndex = 0; // Pointer for the second string
	        
	        // Traverse both strings
	        while (sIndex < s.length() && tIndex < t.length()) {
	            // If characters match, move the pointer in the first string
	            if (s.charAt(sIndex) == t.charAt(tIndex)) {
	                sIndex++;
	            }
	            // Always move the pointer in the second string
	            tIndex++;
	        }
	        
	        // If we've traversed all characters in the first string, it's a subsequence
	        return sIndex == s.length();
	    }

	    public static void main(String[] args) {
	        String s = "abc";
	        String t = "ahbgdc";
	        boolean result = isSubsequence(s, t);
	        System.out.println(result); // Output: true
	    }
	}


