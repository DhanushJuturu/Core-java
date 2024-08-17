package com.vedait.corejavaproject.assignment.strings;

public class StringConcatenation {
	
	static void run(String s1, String s2) {
		
		if(s1.length() > s2.length()) {
			
			String s3=s1.concat(" "+s2);
			System.out.println(s3+" "+s1);
					
		}
		
		else  {
			
			String s3=s2.concat(" "+s1);
			System.out.println(s3+" "+s2);
		}
	}
	
	public static void main(String[] args) {
		
		String s1 = "Justin beiber is the male pop singer";
		String s2 = "Taylor swift is the female singer";
		
		run(s1, s2);
		
	}
}
