package com.cg.designfactory;

public class ShapeFactory {
	public shape getShape(String shapetype) {
		if(shapetype==null) {
			return null;
		}
		if(shapetype.equalsIgnoreCase("circle")) {
			return new Circle();
		}else if(shapetype.equalsIgnoreCase("square")) {
			return new Square();
		}else if(shapetype.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		return null;
		
	}
}
