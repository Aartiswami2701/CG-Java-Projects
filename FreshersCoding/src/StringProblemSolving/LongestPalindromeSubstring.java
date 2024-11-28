package StringProblemSolving;
//Longest Palindromic Substring
//Write a function to find the longest palindromic substring in a given string.
//•	Example:
//Input: "babad"
//Output: "bab" or "aba"

public class LongestPalindromeSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes
            int len1 = expandAroundCenter(s, i, i);
            // Check for even-length palindromes
            int len2 = expandAroundCenter(s, i, i + 1);
            // Get the maximum length of the two
            int len = Math.max(len1, len2);

            // Update the start and end indices if a longer palindrome is found
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the length of the palindrome
        return right - left - 1;
    }

    public static void main(String[] args) {
        String input = "babad";
        String output = longestPalindrome(input);
        System.out.println(output); // Output: "bab" or "aba"
    }
}

