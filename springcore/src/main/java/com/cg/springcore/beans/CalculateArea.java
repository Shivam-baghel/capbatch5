package com.cg.springcore.beans;

public class CalculateArea {
	
	
	private Shape shape;
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void findArea() {
		double area = shape.area();
		System.out.println("Area: "+area);
	}
}
