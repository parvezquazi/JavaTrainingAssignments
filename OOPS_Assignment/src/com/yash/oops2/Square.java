package com.yash.oops2;

public class Square implements Shape {

	@Override
	public void area(double vertexA, double vertexB, double vertexC) {
		double areaOfSquare = (vertexB - vertexA) * (vertexB - vertexA);
		System.out.println("Area Of Square=" + areaOfSquare);

	}

}
