package com.cg.assi1.libra;

public class Magazine extends LibraryItem{
	public Magazine(int id,String title, String Author,int issueNumber) {
		super(id,title,Author);
		this.issueNumber = issueNumber;
	}
	int issueNumber;
	void displayInfo() {
		super.displayInfo();
		System.out.println("Issue number of a book : "+issueNumber);
	}
}
