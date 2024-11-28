package com.cg.mycollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class testLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List l1=new LinkedList();
		l1.add("hello");
		l1.add(6);
		l1.add(10);
		String s=l1.get(1);
		System.out.println("list : "+l1);*/
		
		LinkedList<Integer> l1=new LinkedList<Integer>();
		
		l1.addFirst(10);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		//l1.add(6);
		//l1.add(10);
		//duplicate element
		l1.add(1);
		
		l1.addFirst(10);
		l1.addLast(12);
		l1.add(null);
		System.out.println("before updating list : "+l1);
		l1.add(3, 33);
		l1.remove(4);
		System.out.println("after updating list : "+l1);
		
		System.out.println(" \n"+"After Interator Collection List would be:");
		Iterator it=l1.iterator();
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

