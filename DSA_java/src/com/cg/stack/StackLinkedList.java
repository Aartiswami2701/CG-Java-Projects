package com.cg.stack;

public class StackLinkedList {
	Node top;
	Node head;
	class Node{
		
		Node next;
		Node data;
		
		
		public Node(Node data){
			top=null;
		}
	}

	public boolean IsEmpty() {	
		return(top==null);
	}
	
	
	public void pop() {
		if(IsEmpty()) {
			System.out.println("Stack is empty... Cant pop");
			
		}
		else {
			Node temp=head;
		}
		System.out.println("element poped..."+"from the stack");
	}
	
	public void insertFirsttNode(Node data) {
		
		        Node new_node = new Node(data);
		        new_node.next = top;
		        top = new_node;
		    	
	}
	
	
	public void peek() {
		System.out.print("Top element of stack is : ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedList stl=new StackLinkedList();
		stl.peek();
		

	}


	

}
