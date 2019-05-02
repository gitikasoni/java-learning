package com.examples.javacollection;

import java.util.Map;

public class TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map treeMap = (Map) new TreeMap();
		treeMap.put("IN", "india");
		treeMap.put("SL", "Srilanka");
		treeMap.put("RF", "Roger Federer");
		treeMap.put("IN", "integer");
		treeMap.put("TL", "Tamil Nadu");
		treeMap.put("IN", "india");
		treeMap.put(1, "india");
		System.out.println("HashMap values ... " + treeMap);

		Set s = (Set) treeMap.keySet();

		/*for (Object obj : s) {
			System.out.println("Printng LinkedHashMap elements key : "+obj + ", value :"+treeMap.get(obj));
			
		}*/
	}

		
	

}
