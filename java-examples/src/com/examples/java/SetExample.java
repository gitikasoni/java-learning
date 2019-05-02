package com.examples.java;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String args[]) {

		Set set = new HashSet();
	
		set.add(12);
		set.add(52);
		set.add(62);
		set.add(45);
		set.add(15);
		set.add("Manish and Gitika");
		set.add(3.7);
		
		System.out.println("printing set :"+set);
		System.out.println("printing set size :"+set.size());
		
		
		for(Object obj : set){
			System.out.println("printing set element :"+obj);
			
		}
		
/*		for(int i=0;i<set.size();i++){
			System.out.println("printing set element:"+set.);

		}*/
	
	}
}