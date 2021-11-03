package com.ss.jb.assignment3;

public class Triangle implements Shape {
	
	public int a = 0;
	public int b = 0;
	public int c = 0;
	
	public Triangle() {
		a = 1;
		b = 1;
		c = 1;
		System.out.println("No side lengths input, all sides set to 1.");
	}
	
	public Triangle(int x) {
		a = x;
		b = x;
		c = x;
	}
	
	public Triangle(int x, int y) {
		a = x;
		b = x;
		c = y;
	}
	
	public Triangle(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
	}

	public static void main(String[] args) {
		Triangle tri = new Triangle(5, 1, 10);
		tri.display();
	}
	
	@Override
	public int calculateArea() {
		double p = (this.a + this.b + this.c)/2.0d;
		return (int) Math.round(Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c)));
	}

	@Override
	public void display() {
		if(calculateArea() == 0) {
			System.out.println("Not a possible triangle");
			return;
		}
		System.out.println("The area is " + calculateArea());
		
	}

}
