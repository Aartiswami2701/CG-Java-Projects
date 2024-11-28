package com.cg.mycollection;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
 
public class TestMap {
 
	public static void main(String[] args) {
 
		HashMap<Integer, Integer> hs = new HashMap<>();
		hs.put(1, 100);
		hs.put(2, 200);
 
		Set<Map.Entry<Integer, Integer>> st = hs.entrySet(); // returns Set view
 
//		Set<Map.Entry<Integer, Integer>> stt1 = hs.entrySet(); // returns Set view
 
		for (Map.Entry<Integer, Integer> me1 : st) {
			System.out.print(me1.getKey() + ":");
			System.out.println(me1.getValue());
		}
 
		for (Integer i : hs.keySet()) { // return keySet view
			System.out.println(i);
			System.out.println(i);
		}
 
		for (Integer i : hs.values()) // return valueSet view
		{
			System.out.println(i);
		}
 
		Iterator<Map.Entry<Integer, Integer>> it = hs.entrySet().iterator();
 
		while (it.hasNext()) {
			Map.Entry<Integer, Integer> entry = it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
 
		List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
		System.out.println(listNumbers);
 
		Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
 
		Set<Integer> s = new HashSet<>();
		System.out.println(uniqueNumbers); // unique member
 
		// Search an element
		if (s.contains("Mary")) { // s = names
			System.out.println("Found Mary");
		}
 
		// Bulk Operations
		// a. subset
		Set<Integer> s1 = new HashSet<>(Arrays.asList(20, 56, 89, 31, 8, 5));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(8, 89));
 
		if (s1.containsAll(s2)) {
			System.out.println("s2 is a subset of s1");
 
			// b. union
			s1.addAll(s2);
			System.out.println("s1 after union: " + s1);
 
			// c. Intersection
			s1.retainAll(s2);
			System.out.println("s1 after intersection: " + s1);
 
		}
 
		System.out.println(hs);
 
//		Scanner sc = new Scanner(System.in);
//		int c = 0;
//		int o = 0;
//		int sb = 0;
//		Stack<String> stt = new Stack<>();
//		while (sc.hasNext()) {
//			String input = sc.next();
//			// Complete the code
//			for (int j = 0; j < input.length(); j++) {
//				String str = Character.toString(input.charAt(j));
//				stt.push(str);
//			}
//
//			System.out.println(stt);
//
//			while (!stt.isEmpty()) {
//				System.out.println("peek - " + stt.peek());
//				if (st.peek().equals("("))
//					o++;
//				else if (st.peek().equals("{"))
//					c++;
//				else if (st.peek().equals("["))
//					s++;
//				else if (st.peek().equals(")"))
//					o--;
//				else if (st.peek().equals("}"))
//					c--;
//				else if (st.peek().equals("]"))
//					s--;
//				st.pop();
//
//				stt.pop();
//			}
//
//			System.out.println("After pop - " + c + o + sb + st);
//			if (o != 0 || c != 0 || sb != 0)
//				System.out.println(false);
//			else
//				System.out.println(true);
//		}
	}
 
}