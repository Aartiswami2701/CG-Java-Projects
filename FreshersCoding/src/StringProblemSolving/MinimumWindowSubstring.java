package StringProblemSolving;

import java.util.HashMap;
////Minimum Window Substring
//Given two strings, S and T, write a function that finds the minimum window in S which will contain all the characters in T.
//•	Example:
//Input: S = "ADOBECODEBANC", T = "ABC"
//Output: "BANC"

public class MinimumWindowSubstring {
    public static String minWindow(String S, String T) {
        if (S.length() == 0 || T.length() == 0) return "";

        HashMap<Character, Integer> dictT = new HashMap<>();
        for (char c : T.toCharArray()) {
            dictT.put(c, dictT.getOrDefault(c, 0) + 1);
        }

        int required = dictT.size();
        int left = 0, right = 0;
        int formed = 0;

        HashMap<Character, Integer> windowCounts = new HashMap<>();
        int[] ans = {-1, 0, 0}; // Length of window, left, right

        while (right < S.length()) {
            char c = S.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
                formed++;
            }

            while (left <= right && formed == required) {
                c = S.charAt(left);

                // Save the smallest window and update the answer
                if (ans[0] == -1 || right - left + 1 < ans[0]) {
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }

                windowCounts.put(c, windowCounts.get(c) - 1);
                if (dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return ans[0] == -1 ? "" : S.substring(ans[1], ans[2] + 1);
    }

    public static void main(String[] args) {
        String S = "ADOBECODEBANC";
        String T = "ABC";
        String result = minWindow(S, T);
        System.out.println(result); // Output: "BANC"
    }
}
