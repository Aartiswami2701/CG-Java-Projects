package com.cg.stack;

import java.util.Scanner;

public class StackArray {
	
	int[] Stackarr;
	int max;
	int top;
	
	public StackArray(int size) {
		max =size;
		Stackarr=new int[size];
		top=-1;
		
	}
	
	public boolean IsEmpty() {	
			return(top==-1);
	}
	
	public boolean Isfull() {
			return(top==max-1);
	}
	
	
	
	private void add(int value) {
		// TODO Auto-generated method stub
		if(Isfull()) {
			System.out.println("Stack is Full... Cant Add");
		}
		Stackarr[++top]=value;
		System.out.println("element pushed..."+value +"on to the stack");
	}
	
	public void pop() {
		if(IsEmpty()) {
			System.out.println("Stack is empty... Cant pop");
			
		}
		System.out.println("element poped..."+"from the stack"+Stackarr[top]);
		top--;
		
	}
	
	public void peek() {
		System.out.print("Top element of stack is : "+Stackarr[top]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArray st=new  StackArray(5);
		
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice for Stack: ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display Top Element");
            System.out.println("4. Exit");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                	 System.out.println("Enter value to insert: ");
                     int val = scanner.nextInt();
                     st.add(val);
                     break;
                case 2:
                    System.out.println("Enter value to delete: ");
                    st.pop();
                    break;
                case 3: 
                    st.peek();
                    break;
                case 4:
                	System.out.println("Exiting...");
                    scanner.close();
                    return;
            }
        	}
	}
}
	


