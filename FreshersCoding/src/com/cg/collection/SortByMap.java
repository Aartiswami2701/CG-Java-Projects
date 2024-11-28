package com.cg.collection;
//Sort Map by Values
//You are given a map of string keys and integer values. Write a program to sort the map by values.
import java.util.*;
public class SortByMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 1);
        map.put("cherry", 2);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
