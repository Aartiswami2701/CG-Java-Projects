package com.cg.mycollection;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class myStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack l1=new Stack();;		
		l1.push(1);
		l1.push(2);
		l1.push(3);
		l1.push(4);
		Iterator it=l1.iterator();
		System.out.println(" \n"+" using stack would be:");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(" \n"+"after using pop method stack would be:");
		l1.pop();
		l1.pop();
		l1.pop();
		l1.pop();
		l1.pop();
	

	}

}
