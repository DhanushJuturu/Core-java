package com.vedait.corejavaproject.assignment.strings;

public class ReplacingStringValue {
	
	static void replacingValue(String sname) {
		
		if(sname.length() > 3) {
			
			String s2 = sname.substring(sname.length()-3);
			System.out.println(s2.concat(sname).concat(s2));
		}
		
		else {
			
			System.out.println("String characters are not sufficient");
		}
	}
	
	public static void main(String[] args) {
		
		String s1 = "Java";
		replacingValue(s1);
	}
}
