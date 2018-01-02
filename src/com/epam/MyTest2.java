package com.epam;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class MyTest2 {

	public static void main(String[] args) {
	// Write a Java program to compare two sets and retain elements which are same on both sets 
		 HashSet<String> set1 = new HashSet<String>();
	     set1.add("a");
	     set1.add("b");
	     set1.add("c");
	     
	     HashSet<String> set2 = new HashSet<String>();
	     set2.add("a");
	     set2.add("b");
	     set2.add("d");
	     
	     set1.retainAll(set2);
	     System.out.println("Elements which are same on both sets"+set1.toString());
	     System.out.println("===============");
	     
	   //Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.
	    
	     TreeSet<Integer> tree = new TreeSet<Integer>();
	     tree.add(1);
	     tree.add(2);
	     tree.add(3);
	     tree.add(4);
	     tree.add(5);
	     tree.add(6);
	     
	     System.out.println("Enter a number less than 7");
	     Scanner scanner = new Scanner(System.in);
	     int searchNumber = scanner.nextInt();
	     
	     for (Integer integer : tree) {
	    	 if(integer>= searchNumber){
	    		System.out.println("Element in a tree set which is strictly greater than or equal: " + integer);
	    	 }
		 }
	     System.out.println("===========================");
	   //Write a Java program to change priorityQueue to maximum priorityqueue. 
	     PriorityQueue<String> pQueue = new PriorityQueue<String>(20,Collections.reverseOrder());
	     pQueue.add("aaa");
	     pQueue.add("bbb");
	     pQueue.add("ccc");
	     pQueue.add("ddd");
	     Iterator<String> itr2 = pQueue.iterator();
	     System.out.println("Maximum priorityqueue:");
	     while (itr2.hasNext())
	            System.out.println(itr2.next());
	     System.out.println("===========================");
	   //Write a Java program to convert a Priority Queue elements to a string representation
	     System.out.println("Priority Queue elements to a string representation"+pQueue.toString());
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	    	 
	     
	     
	     
	     
	    
	     
	     
	     
	     
	     
	     

	}

}
