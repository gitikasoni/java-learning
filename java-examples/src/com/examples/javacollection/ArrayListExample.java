package com.examples.javacollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(12);
		list.add("gitika");
		list.add(2);
		list.add("Ram");
		list.add(2);
		list.add("Shyam");

		System.out.println("Printing the list elements : " + list);

		// 1. Using For loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Printing elements using for loop : "
					+ list.get(i));
		}

		for (Object obj : list) {
			System.out.println("Printing elements using foreach loop : "
					+obj);
		}
	}

}
