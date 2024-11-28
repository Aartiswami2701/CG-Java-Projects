package com.cg.applicationBook;

public class Book {

	int id;
	String title;
	String Publisher;
	boolean isAvailable;
	public Book(int id, String title, String publisher, boolean isAvailable) {
		super();
		this.id = id;
		this.title = title;
		Publisher = publisher;
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", Publisher=" + Publisher + ", isAvailable=" + isAvailable
				+ "]";
	}
	
	

}
