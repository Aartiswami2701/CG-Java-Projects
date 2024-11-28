package com.cg.assi1.libra;

public class UseLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryItem[] l1= new LibraryItem[3];
		l1[0]=new Book(111,"Titanic","Aditi Mandlik","ABC",500);
		l1[1]=new Magazine(222,"leo the lie","manshree",8778943);
		l1[2]=new Journel(333,"BuinessWomen Of the Year","Aarti Swami",300,8.9);
		for(LibraryItem l:l1) {
			l.displayInfo();
			System.out.println(LibraryItem.getItemCount());
		}
		
		
	}

}
