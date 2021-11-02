/**
 * 
 */
package com.ss.jb.one;

/**
 * @author thoma
 *
 */
public class Pattern {
	public static void main(String[] args) {
		allTriangles();
	}
	
	public static void allTriangles() {
		leftTriangle();
		upsideDownLeftTriangle();
		upTriangle();
		downTriangle();
	}
	
	public static void leftTriangle() {
		System.out.println("1)");
		String star = "";
		for(int i = 0; i < 4; i++) {
			star = star + "*";
			System.out.println(star);
		}
		System.out.println(".........");
	}
	
	public static void upsideDownLeftTriangle() {
		System.out.println("2)\n.........");
		String star = "****";
		for(int i = 0; i < 4; i++) {
			System.out.println(star);
			star = star.substring(0, star.length() - 1);
		}
	}
	
	public static void upTriangle() {
		System.out.println("3)");
		int spaces = 4;
		String star = "";
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j <= spaces; j++) {
				star = star + " ";
			}
			spaces--;
			for (int k = 0; k < (i * 2) + 1; k++) {
				star = star + "*";
			}
			System.out.println(star);
			star = "";
		}
		System.out.println("...........");
	}
	
	public static void downTriangle() {
		System.out.println("4)\n...........");
		String star = "";
		int spaces = 1;
		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j <= spaces; j++) {
				star = star + " ";
			}
			spaces++;
			for (int k = 0; k < (i * 2) + 1; k++) {
				star = star + "*";
			}
			System.out.println(star);
			star = "";
		} 
	}
}
