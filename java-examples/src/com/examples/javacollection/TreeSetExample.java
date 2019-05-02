package com.examples.javacollection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unique+ asc/desc
		
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("Ramesh");
		tree.add("Arnaaz");
		tree.add("Ram");
		tree.add("Mahesh");
		tree.add("Mahesh");
		System.out.println("Tree Set example-- " +tree.descendingSet());

		for(String str1: tree)
		{
			System.out.println("TreeSet example using foreach loop " + str1);
		}
	}

}
