package com.cg.queue;

class Node{
	Node next;
	int data;
	public Node(int data) {
		this.data = data;
		this.next=null;		
		}
}

public class QueueLinkedList {

	Node rear;
	Node front;
	int nItem;
	
	
	public QueueLinkedList(Node rear, Node front, int nItem) {
		this.rear = null;
		this.front = null;
		this.nItem = 0;
	}


	public boolean IsEmpty() {
		return(nItem==0);
	}
	
	public void insert(int n) {
		Node newnode= new Node(n);
		
		if(IsEmpty()) {
			front=newnode;
			rear=newnode;
		}else {
			rear.next=newnode;
		}
		rear=newnode;
		nItem++;
	}
	
	public void display() {
		Node current=front;
		if(IsEmpty()) {
			System.out.println("Queue is Empty");
		}else {
			System.out.println("Queue Elements");
			while(current!=null) {
				System.out.print(" "+current.data);
				current=current.next;
			}
		}System.out.println("");
	}
	
	public int remove() {
		int temp;
		
		if(IsEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}else {
			
			temp=front.data;
			front=front.next;
			
			System.out.println("Element Removed at location from queue. ");
			nItem--;
		}
		if(IsEmpty()){
			//front=rear	condition1
			rear=null;
		}
		return temp;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node rear = null;
		Node front=null;
		int nItem=0;
		QueueLinkedList ql=new QueueLinkedList(front,rear, nItem);
		ql.insert(10);
		ql.insert(20);
		ql.insert(30);
		ql.insert(40);
		ql.display();
		ql.remove();
		ql.display();
		
		
		
		
		

	}

}
