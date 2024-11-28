package com.cg.linkedlist;

class Node{
	int data;
	Node next;
	public void display() {
		System.out.println(" " +data);
	}
}

public class SingleLinkedList {
	Node first;
	Node current;
	public SingleLinkedList() {
		
	}
	
	public boolean IsEmpty() {
		return first==null;
	}
	
	public void insertLastNode(int data) {
		Node current =first;
		while(current.next!=null) {
			current=current.next;
		}
		Node n=new Node();
		n.data=data;
		current.next=n;
	}
	
	public void insertFirsttNode(int data) {
		Node newnode= new Node();
		newnode.data=data;
		newnode.next=first;
		first=newnode;
		
	}
	public void SearchNode(int data) {
		int count =0;
		Node current = first;    
        while (current != null)
        {
            // Data found
            if (current.data == data)
            {
            	System.out.println("Element found at Position at : "+count);
            }   
            
            current = current.next;
            count++;
        }
	}
	
	void deleteNode(int key) {
        if (first == null) {
            System.out.println("List is empty.");
            return;
        }
 
        // If head is the node to be deleted
        if (first.data == key) {
            first = first.next;
            return;
        }
 
        Node temp = first;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
 
        if (temp.next == null) {
            System.out.println("Node with value " + key + " not found.");
        } else {
            temp.next = temp.next.next;
        }
    }
 
    // Delete a node at a specific position
    void deleteAtPosition(int position) {
        if (first == null) {
            System.out.println("List is empty.");
            return;
        }
 
        if (position == 1) {
            first = first.next;
            return;
        }
 
        Node temp = first;
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
 
        if (temp == null || temp.next == null) {
            System.out.println("Position is out of range.");
        } else {
            temp.next = temp.next.next;
        }
    }
 
    // Delete the first node (head)
    void deleteAtBeginning() {
        if (first == null) {
            System.out.println("List is empty.");
            return;
        }
        first = first.next;
    }
 
    // Delete the last node
    void deleteAtEnd() {
        if (first == null) {
            System.out.println("List is empty.");
            return;
        }
 
        // If the list has only one node
        if (first.next == null) {
            first = null;
            return;
        }
 
        Node temp = first;
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
 
        temp.next = null;
    }
		
	
	
	public void displayList(){
		System.out.println("List (first --> last) ");
		Node current = first;
		while(current != null){
			current.display();
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		SingleLinkedList sl=new SingleLinkedList();
		sl.insertFirsttNode(5);
		sl.insertFirsttNode(10);
		sl.insertFirsttNode(11);
		sl.insertFirsttNode(12);
		sl.insertLastNode(15);
		sl.displayList();
		sl.SearchNode(5);
		
		//sl.deleteNode(position);
		sl.displayList();
		
	}

	
}
