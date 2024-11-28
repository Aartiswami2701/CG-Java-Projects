package StringProblemSolving;
//Word Break Problem
//Given a string and a dictionary of words, determine if the string can be segmented into a space-separated sequence of dictionary words.
//•	Example:
//Input: "applepenapple", ["apple", "pen"]
//Output: true

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordBreakProblem {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict); // Convert list to set for O(1) lookups
        boolean[] dp = new boolean[s.length() + 1]; // DP array to track word break possibilities
        dp[0] = true; // Base case: empty string can always be segmented

        // Iterate through the string
        for (int i = 1; i <= s.length(); i++) {
            // Check each substring ending at i
            for (int j = 0; j < i; j++) {
                // If the substring s[j:i] is in the word set and s[0:j] can be segmented
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true; // Mark dp[i] as true
                    break; // No need to check further
                }
            }
        }

        return dp[s.length()]; // Result: can the whole string be segmented?
    }

    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> wordDict = List.of("apple", "pen");
        boolean result = wordBreak(s, wordDict);
        System.out.println(result); // Output: true
    }
}
