package com.cg.assi;
interface shape{
	void CalculateArea();
	void CalculatePerimeter();
}
public class Rectangle implements shape {
	int length=5;
	int width=2;
	void CalculateArea() {
		int area= 2*(length*width);
		System.out.println("Area of Rectangle : "+area);
	}
	void CalculatePerimeter() {
		int pr= 2*(length+width);
		System.out.println("Area of Rectangle : "+pr);
	}

}
