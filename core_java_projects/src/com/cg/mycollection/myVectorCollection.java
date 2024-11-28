package com.cg.mycollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class myVectorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> l1=new Vector<Integer>();		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		Iterator it=l1.iterator();
		System.out.println(" \n"+"Interator Collection List would be:");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
