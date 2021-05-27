package com.cg.springcore.beans;

public class Circle implements Shape {
	
	private int radius;

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		double result = 3.14*radius*radius;
		return result;
	}

}
