package edu.bit.ex;

public class Triangle {
	double width,height;
	
	public Triangle() {
		
	}
	
	public Triangle(double width, double height){
		this.width=width;
		this.height=height;
	}
	public double getTriangleArea(double width, double height) {
		return (width*height)/2;
	}
}
