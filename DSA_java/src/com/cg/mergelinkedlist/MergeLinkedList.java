package com.cg.mergelinkedlist;

import java.util.ArrayList;
import java.util.Collections;


public class MergeLinkedList {
	 Node head;
	 Node tail;
	 
	 class Node {
		    int data;
		    Node next;
			//public Object tail;
			

		    public Node(int data) {
		        this.data = data;
		        this.next = null;
		    }

		    public void display() {
		        System.out.print(data + " ");
		    }
		}
	
	public void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            //tail.next = head; // Make it circular
        } else {
            tail.next = newnode;
            tail = newnode;
            //tail.next = head; // Maintain circular property
        }
    }
	
	public void displayList() {
		Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        while (current != null){
            System.out.println("" + current.data);
            current = current.next;
            
        } 
        System.out.println();
    }
	
	public static  MergeLinkedList merge(MergeLinkedList list1,MergeLinkedList list2) {
		list1.tail.next=list2.head;
		return list1 ;
		
	}

	
	
    public static void main(String[] args) {
    	MergeLinkedList ml= new MergeLinkedList();
    	ml.insert(10);
    	ml.insert(20);
    	ml.insert(30);
    	ml.insert(40);
    	System.out.println("List1: ");
    	ml.displayList();
    	
    	MergeLinkedList ml1= new MergeLinkedList();
    	ml1.insert(100);
    	ml1.insert(20);
    	ml1.insert(300);
    	ml1.insert(11);
    	System.out.println("List2: ");
    	ml1.displayList();
    	
    	
    	
    	
    	
    	
    	MergeLinkedList mergedList = merge(ml, ml1);
        System.out.println("Merged List: ");
        mergedList.displayList();
    	
        ArrayList<Integer> mergedArrayList = new ArrayList<>();
        Node current = mergedList.head;
        while (current != null) {
            mergedArrayList.add(current.data);
            current = current.next;
        }

        Collections.sort(mergedArrayList);
        System.out.println("Sorted Merged List: " + mergedArrayList);
 
    }
}
