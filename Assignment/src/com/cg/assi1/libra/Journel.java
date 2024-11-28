package com.cg.assi1.libra;

public class Journel extends LibraryItem{
	int Volume;
	double impactFactor;
	
	public Journel(int id,String title, String Author,int Volume, double impctFactor) {
		super(id,title, Author);
		// TODO Auto-generated constructor stub
		this.Volume=Volume;
		this.impactFactor =impactFactor;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Volume of a Journel : "+Volume +"\n"+"Impact Factor of Journel : "+impactFactor);
	}
}
