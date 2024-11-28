package com.cg.mycollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class myIteratorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		Iterator it=l1.iterator();
		System.out.println(" \n"+"Interator Collection List would be:");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(" \n"+"After List Interator Collection List would be:");
		ListIterator itl=l1.listIterator();
		while(itl.hasNext()) {
			System.out.println(itl.next());
		}
		System.out.println(" \n"+"After previous method List would be:");
		
		while(itl.hasPrevious()) {
			System.out.println(itl.previous());
		}
	}

}
