package com.vedait.corejavaproject.assignment.strings;

import java.util.Scanner;

public class StringOperations {
	
	public static void main(String[] args) {
//		String s = "I love my parents";
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}
}
