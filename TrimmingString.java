package com.vedait.corejavaproject.assignment.strings;

public class TrimmingString {
	
	public static void main(String[] args) {
		
		String str = "		front and end		";
		String newstr = str.trim();
		
		int len = newstr.length();
		
		if(len>10) {
			System.out.println(newstr);
		}
		
		else {
			System.out.println("String value is not sufficient.");
		}
	}
}
