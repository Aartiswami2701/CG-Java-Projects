package com.cg.collection;
//Group Anagrams
//Given an array of strings, group anagrams together.
import java.util.*;
public class GroupANagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String str : list) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            anagramMap.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }
        
        System.out.println(new ArrayList<>(anagramMap.values()));

	}

}
