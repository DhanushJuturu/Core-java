package com.vedait.corejavaproject.assignment.strings;

import java.util.Scanner;

public class StringCaptialize {
	
	static void captialize(String str){
		
		String[] sarray = str.split(" ");
		
		for(int i=0; i<sarray.length; i++) {
			sarray[i] = String.valueOf(sarray[i].charAt(0)).toUpperCase().concat(sarray[i].substring(1));
//			sarray[i] =Character.toUpperCase(sarray[i].charAt(0))+(sarray[i].substring(1));
			 
			 System.out.print(sarray[i]+" ");
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		
		captialize(str);
	}
}
