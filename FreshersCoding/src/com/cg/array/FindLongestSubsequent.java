package com.cg.array;
///Find the Longest Consecutive Sequence
///Given an unsorted array of integers, find the length of the longest consecutive sequence of elements.



import java.util.HashSet;

public class FindLongestSubsequent {

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2}; // Example input
        int longestSequenceLength = longestConsecutiveSequence(arr);
        System.out.println("Length of Longest Consecutive Sequence: " + longestSequenceLength);
    }

    public static int longestConsecutiveSequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        
        // Add all elements to the HashSet
        for (int num : arr) {
            set.add(num);
        }

        int longestStreak = 0;

        // Check each number to find the start of a consecutive sequence
        for (int num : arr) {
            // Only check for the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Check for the next consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update longest streak if current is longer
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak; // Return the length of the longest consecutive sequence
    }
}
