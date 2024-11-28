package com.cg.circular;

class Node{
	int data;
	Node next;
	public Node(int data) {
        this.data = data;
        this.next = null;
    }
	public void display() {
		System.out.println(" " +data);
	}
}

public class SingleCircular {
	Node head;
	Node tail;
	Node current;
	public SingleCircular() {
		Node head=null;
		Node tail=null;
	}
	
	
	private void insert(int data) {	
		Node newnode= new Node(data);
		if(head==null) {
			head= newnode;
			tail=newnode;
		}
		else {
			tail.next=newnode;
			tail=newnode;
			newnode.next=head;
		}
	}
	
	public void displayList(){
		System.out.println("List (first --> last) ");	
		current = head;
		if(head==null) {
			 System.out.print("list is empty");
		}
		else {
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
		}
        System.out.println();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleCircular sc=new SingleCircular();
		sc.insert(10);
		sc.insert(20);
		sc.insert(30);
		sc.displayList();
		

	}

	
}
