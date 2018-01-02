package com.epam;

import java.util.Scanner;
import java.util.TreeMap;

public class KeyValue {

	public static void main(String[] args) {
		//Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
		  
		  TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
		  // Put elements to the map 
		  tree_map.put(10, "aaaa");
		  tree_map.put(20, "gggg");
		  tree_map.put(30, "bbbb");
		  tree_map.put(40, "cccc");
		  tree_map.put(50, "ffff");
		  
		  System.out.println("Enter a number in 10,20,30,40,50");
	      Scanner scanner = new Scanner(System.in);
	      int searchNumber = scanner.nextInt();
		  System.out.println("Orginal TreeMap content: " + tree_map);
		  System.out.println("Keys greater than or equal to "+searchNumber+":" + tree_map.ceilingEntry(searchNumber));
	}

}
