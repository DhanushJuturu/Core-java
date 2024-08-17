package com.vedait.corejavaproject.assignment.strings;

public class SubString {
	
	static void call(String sname) {
		
		if(sname.length() > 10) {
			
			String s1 = sname.substring(2, 15);
			s1 = Character.toUpperCase(s1.charAt(0))+s1.substring(1);
			System.out.println(s1);
		}
	
	}
	
	
	public static void main(String[] args) {
		
		String sname = "Supercalifragilisticexpialidocious"; 
		call(sname);
		
	}
}
