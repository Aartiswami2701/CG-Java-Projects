package StringProblemSolving;
//Valid Parentheses
//Write a function to determine if a given string of parentheses is valid. A valid string must have matching pairs of opening and closing parentheses.
//•	Example:
//Input: "()[]{}"
//Output: true
import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Create a mapping of closing to opening parentheses
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c); // Push opening brackets onto the stack
            } else {
                // Check for mismatched closing brackets
                if (stack.isEmpty()) {
                    return false; // No opening bracket for the closing one
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false; // Mismatched brackets
                }
            }
        }
        return stack.isEmpty(); // True if all opening brackets are matched
    }

    public static void main(String[] args) {
        String input = "()[]{}";
        boolean output = isValid(input);
        System.out.println(output); // Output: true
    }
}

/*import java.util.HashMap;

public class ProblemString1_2 {
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        // Counter to keep track of the balance
        int count = 0;

        for (char c : s.toCharArray()) {
            if (map.containsValue(c)) {
              
                count++;
            } else if (map.containsKey(c)) {
                
                count--;
               
                if (count < 0) {
                    return false;
                }
            }
        }

       
        return count == 0;
    }

    public static void main(String[] args) {
        String input = "()[]{}";
        boolean output = isValid(input);
        System.out.println(output); // Output: true
    }
}*/
