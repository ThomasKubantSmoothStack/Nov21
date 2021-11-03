package com.ss.jb.assignment1;

import java.util.Scanner;

public class SumOfInputs {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		SumOfInputs soi = new SumOfInputs();
		soi.sum();
	}
	
	public int sum() {
		int sum = 0;
		System.out.println("Enter integers to be added: ");
		String input = sc.nextLine();
		String[] inputArr = input.split(" ");
		for (int i = 0; i < inputArr.length; i++) {
			sum = sum + Integer.parseInt(inputArr[i]);
		}
		System.out.println("The sum is: " + sum);
		return sum;
		
	}
}
