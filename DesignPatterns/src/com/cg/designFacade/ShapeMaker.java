package com.cg.designFacade;

public class ShapeMaker {
	private shape circle;
	private shape rectangle;
	private shape square;
	public ShapeMaker() {
		circle= new Circle();
		rectangle= new Rectangle();
		square= new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
}
