package com.cg.mycollection;

import java.util.*;

public class HashTableclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<String, Integer> ht= new  Hashtable<String, Integer>();
		 ht.put("laptop", 10);
		 ht.put("mobile", 20);
		 ht.put("headphone", 30);
		 //prints elements in random
		 System.out.println(ht);
		 System.out.println(ht.get("laptop"));
		 System.out.println(ht.containsKey("laptop"));
		 System.out.println(ht.containsValue(10));
		 ht.remove("laptop");
		 System.out.println(ht);
		 
		 System.out.println("keys of Hashtable");
		 for(String str:ht.keySet()) {
			 System.out.println(str);
		 }
		 System.out.println("Values of Hashtable");
		 for(Integer in:ht.values()) {
			 System.out.println(in);
		 }
		 
		 System.out.println("Size of Hashtable "+ht.size());
		 System.out.println("is your hashtable is empty :"+ht.isEmpty());
		 
		 
		 ht.clear();
		 System.out.println("After Cleared HashTable: ");
		 System.out.println("Size of Hashtable "+ht.size());
		 System.out.println("is your hashtable is empty :"+ht.isEmpty());
		 
		 
	}

}
