package com.cg.designfactory;

public class UseFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf= new ShapeFactory();
		shape s1= sf.getShape("circle");
		s1.draw();
		
		shape s2= sf.getShape("rectangle");
		s2.draw();
		
		shape s3= sf.getShape("square");
		s3.draw();
	}

}