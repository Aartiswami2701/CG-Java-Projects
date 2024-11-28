package com.pro;

public class Product {
	int id;
	String name;
	double price;
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price=price;
	}
	
	public void display() {
		System.out.println("Product ID : "+id + "\n"+"Product Name : "+name+ "\n"+"Product Price : "+ "\n");
	}

	

	
	
	public void total_price(double p2) {
		System.out.println(this.price+p2);
	}
	
		
}
