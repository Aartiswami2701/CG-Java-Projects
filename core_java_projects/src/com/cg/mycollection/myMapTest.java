package com.cg.mycollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class myMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n"+"Hashmap Implementation");
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("Aarti", 8888);
		h.put("Swami", 9999);
		h.entrySet();
		System.out.println(h);
		
		//entryset for a map view set
		System.out.println("\n"+"Implementation of set with entryset");
		Set<Map.Entry<String,Integer>> sm= h.entrySet();
		for(Map.Entry<String,Integer> i : sm) 
		{
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		}
		System.out.println("\n"+"Implementation of set with keyset");
		for(String str :h.keySet()) {
			System.out.println(str);
		}
		
		System.out.println("\n"+"Implementation of set with getvalue");
		for(Integer str :h.values()) {
			System.out.println(str);
		}
		
		System.out.println("\n"+"Implementation of set with Iterator");
		Iterator<Map.Entry<String,Integer>> im= h.entrySet().iterator();
		while(im.hasNext()) {
			Map.Entry<String, Integer>entry=im.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}


