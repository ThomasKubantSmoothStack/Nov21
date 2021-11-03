/**
 * 
 */
package com.ss.jb.assignment3;

/**
 * @author thoma
 *
 */
public class Rectangle implements Shape {
	 
	public int width = 0;
	public int height = 0;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle(int a) {
		width = a;
		height = a;
	}
	
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	@Override
	public int calculateArea() {
		return this.height * this.width;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("The area is " + calculateArea());
	}

}
