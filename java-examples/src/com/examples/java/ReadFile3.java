package com.examples.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 
			System.out.println("After try catch  ... flow continues");
	}

}
