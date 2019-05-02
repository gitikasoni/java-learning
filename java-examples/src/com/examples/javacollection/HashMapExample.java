package com.examples.javacollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map = new HashMap();
		
		map.put("IN", "india");
		map.put("SL", "Srilanka");
		map.put("RF", "Roger Federer");
		map.put("IN", "integer");
		map.put("TL", "Tamil Nadu");
		map.put("IN", "india");
		map.put(1, "india");
		
		System.out.println("HashMap Example " +map);
		
		System.out.println("HashMap size " +map.size());

	}

}
