package com.cg.mycollection;

import java.util.ArrayList;
import java.util.Iterator;

public class testArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		//duplicate element
		l1.add(1);
		l1.add(3);
		l1.add(4);
		l1.add(null);
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		for(Integer i:l1) {
			System.out.println(i);	
		}
		Iterator i= l1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
