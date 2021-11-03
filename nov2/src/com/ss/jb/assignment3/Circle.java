/**
 * 
 */
package com.ss.jb.assignment3;

/**
 * @author thoma
 *
 */
public class Circle implements Shape {

	public int radius = 0;
	
	public Circle() {
		radius = 1;
		System.out.println("No radius input, radius set to 1."); 
	}
	
	public Circle(int r) {
		radius = r;
	}
	public static void main(String[] args) {
		Circle circ = new Circle(5);
		circ.display();

	}

	@Override
	public int calculateArea() {
		return (int) Math.round((this.radius * this.radius) * Math.PI);
	}

	@Override
	public void display() {
		System.out.println("The area is " + calculateArea());
	}

}
