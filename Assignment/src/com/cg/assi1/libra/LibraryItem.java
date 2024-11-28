package com.cg.assi1.libra;

public class LibraryItem {
	int id;
	String title;
	String Author;
	static int ItemCount=0;
	
	static int getItemCount() {
		return ++ItemCount;
	}

	public LibraryItem(int id,String title, String Author) {
		super();
		// TODO Auto-generated constructor stub
		this.id=id;
		this.title=title;
		this.Author=Author;
		
	}
	void displayInfo() {
		System.out.println("ID : "+id+"\n"+"Title : "+title+"\n"+"Author : "+Author);
	}
}
