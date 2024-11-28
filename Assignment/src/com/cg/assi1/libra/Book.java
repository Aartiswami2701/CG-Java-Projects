package com.cg.assi1.libra;

public class Book extends LibraryItem {
	String ISBN;
	int pages;
	
	public Book(int id,String title, String Author,String iSBN, int pages) {
		super(id,title,Author);
		ISBN = iSBN;
		this.pages = pages;
	}
	
	void displayInfo() {
		super.displayInfo();
		System.out.println("ISBN Of a book : "+ISBN +"\n"+"Number of pages of book : "+pages);
	}
}
