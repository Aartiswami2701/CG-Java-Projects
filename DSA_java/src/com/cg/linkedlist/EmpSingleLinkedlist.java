package com.cg.linkedlist;

public class EmpSingleLinkedlist {
	
	private Node first;
	Node last;
	
	class Node{
		Employee1 data;
		Node next;
		public void display() {
			System.out.println(" "+data);
		}
	}
	
	private void insertFirst(Employee1 data) {
		// TODO Auto-generated method stub
		
		Node newnode= new Node();
		newnode.data=data;
		newnode.next=first;
		first=newnode;
		
	}
	

	private void insertLast(Employee1 data) {
		// TODO Auto-generated method stub
		Node current =first;
		while(current.next!=null) {
			current=current.next;
		}
		Node n=new Node();
		n.data=data;
		current.next=n;
		
	}

	private void displayNode() {
		// TODO Auto-generated method stub
		System.out.println("List (first --> last) ");
		Node current = first;
		while(current != null){
			current.display();
			current = current.next;
		}
		System.out.println();
		
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp=new Employee1(1,"Aarti");
		Employee1 emp1=new Employee1(2,"Adi");
		Employee1 emp2=new Employee1(3,"Ashu");
		Employee1 emp3=new Employee1(4,"Ashi");
		EmpSingleLinkedlist eml= new EmpSingleLinkedlist();
		
		
		eml.insertFirst(emp);
		eml.insertFirst(emp1);
		eml.insertFirst(emp2);
		eml.insertLast(emp3);
		eml.displayNode();
		
	}

}
