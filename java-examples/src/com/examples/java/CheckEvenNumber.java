package com.examples.java;

public class CheckEvenNumber {
	public static void main(String args[]) {

		int num[] = new int[5];

		System.out.println("Assigning value to numbers");
		num[0] = 1;
		num[1] = 4;
		num[2] = 3;
		num[3] = 8;
		num[4] = 6;

		for (int i = 0; i < num.length; i++) {
			
			if(num[i]%2==0)
			{
			System.out.println(num[i]);
			}
		}
	}
}
