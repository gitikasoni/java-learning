package com.examples.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetByGenericsExample {
	
	public static void main(String args[]) {
		
		//unique + random order
		Set<String> set = new HashSet<String>();

		//unique + insertion order
		Set<String> linkedHashSet = new LinkedHashSet<String>();

		//unique + asc/desc order
		Set<String> treeSet = new TreeSet<String>();
		
		set.add("Manish");
		set.add("Gitika");
		set.add("Manish");
		set.add("Gitika");
		set.add("Raghav");
		set.add("Soumitra");
		set.add("Sachin");
//		set.add(5.2);
		
		System.out.println("Printing Set :"+set);
		
		System.out.println("Printing Set size:"+set.size());
		
		//Iterating by foreach
		for(String str : set){
			System.out.println("Printing Set element using forEach :"+str);
			
		}
		System.out.println("**************************************");
		//Iterating by iterator

		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println("Printing Set element using iterator :"+itr.next());
		}
		
		
		
		
		
	}

}
