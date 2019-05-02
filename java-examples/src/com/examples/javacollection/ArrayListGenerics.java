package com.examples.javacollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("My");
		list.add("name");
		list.add("is");
		list.add("Khan");
	
		for(int i = 0;i<list.size();i++)
		{
			System.out.println("Printing list elements: " +list.get(i));
		}
	
		for(String str : list)
		{
			System.out.println("Using for each loop " + str);
		}
	}

}
