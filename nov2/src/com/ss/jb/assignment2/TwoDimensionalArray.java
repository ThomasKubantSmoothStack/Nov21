package com.ss.jb.assignment2;

public class TwoDimensionalArray {
		int[][] arr = {{10, 2, 3, 19},{20, 6, 7, 10}};
	public static void main(String[] args) {
		TwoDimensionalArray arr = new TwoDimensionalArray();
		arr.findHighestValueTwoDArray();
	}
	
	public void findHighestValueTwoDArray() {
		int highestValue = -9999;
		String arrIndex = "";
		for(int i = 0; i < this.arr.length; i++) {
			for(int j = 0; j < this.arr[i].length; j++) {
				if(highestValue < arr[i][j] || (i == 0 && j == 0)) {
					highestValue = arr[i][j];
					arrIndex = i + " " + j;
				}
			}
		}
		System.out.println("The highest value of the 2D array is: " + highestValue + ". The index of this value is: " + arrIndex);
	}
}
