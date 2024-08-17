package com.vedait.corejavaproject.assignment.strings;

public class ContentMatching {
	
	static void matching(String s1, String s2) {
		
		if(s1.contains(s2)) {
			
			System.out.println("Content matched");
		}
		
		else {
			
			System.out.println("Content not matched");
		}
		
			
		
	}
	
	public static void main(String[] args) {
		
		String s1 = "India is the safest place to live";
		String s2 = "safest";
		matching(s1,s2);
	}
		
	}
	

