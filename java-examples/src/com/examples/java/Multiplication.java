package com.examples.java;

import java.util.Scanner;

public class Multiplication {

	public static void main(String args[]) {
		int a, b, c;
		System.out.println("Enter first number");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		System.out.println("Enter second number");
		b = scan.nextInt();
		c = a * b;
		System.out.println("The  multiplication of two numbers is " + c);

		
		
	}
}
