package com.examples.java;

import java.util.Scanner;

public class Addition {

	public static void main(String args[]) {

		float a, b, c;
		System.out.println("Enter first number");
		Scanner scan = new Scanner(System.in);
		a = scan.nextFloat();
		System.out.println("Enter second number");
		b = scan.nextFloat();

		c = a + b;
		System.out.print("The sum of two numbers is " + c);

	}

}
