package StringProblemSolving;
//String Rotation
//Check if one string is a rotation of another string.
//•	Example:
//Input: "waterbottle", "erbottlewat"
//Output: true

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "waterbottle";
	        String str2 = "erbottlewat";
	        boolean result = isRotation(str1, str2);
	        System.out.println("Is rotation:  " + result); // Output: true
	    
	}

	private static boolean isRotation(String str1, String str2) {
		// TODO Auto-generated method stub
		 if (str1.length() != str2.length()) {
	            return false;
	        }

	        // Concatenate str1 with itself
	        String concatenated = str1 + str1;

	        // Check if str2 is a substring of the concatenated string
	        return concatenated.contains(str2);
	    
	}

}
