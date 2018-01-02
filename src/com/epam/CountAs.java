package com.epam;

import java.util.Scanner;

public class CountAs {

	public static void main(String[] args) {
	//Write a program to check how many 'a's are there in a given stringr
		 int count=0;
		 System.out.println("Enter a Strng");
	     Scanner scanner = new Scanner(System.in);
	     String searchString = scanner.next();
	     
	     char carray[] = searchString.toCharArray();
	     
	     for (char d : carray) {
			if(d == 'a' || d == 'A'){
				count = count + 1;
			}
		 }
	     
	     System.out.println("Number of A's in given string: " + count);
	     

	}

}
