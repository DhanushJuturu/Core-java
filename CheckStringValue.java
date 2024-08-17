package com.vedait.corejavaproject.assignment.strings;

public class CheckStringValue {
	
	static void isStart(String str) {
		
		str = (str.startsWith("Justin "))? "True" : "False";	
		System.out.println(str);
		
//		if(str.startsWith("J")) {
//			
//			System.out.println("True");
//		}
//		
//		else {
//			System.out.println("False");
//		}
		
	}
	
	public static void main(String[] args) {
		
		String sname = "Justin beiber is my favourite artist";
		isStart(sname);
		
	}
}
