package com.vedait.corejavaproject.assignment.strings;

public class CompareReverse {
	
	static void compareString(String sname){
		
		System.out.println(sname.equals("hello"));
	}
	
	static void reverseString(String sname) {
		
		for(int i=sname.length()-1; i>=0; i--) {
			
			System.out.print(sname.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		
		char[] arr = {'h','e','l','l','o','b','a','b','y','g','i','r','l'};
		String sname = new String(arr);
		System.out.println(sname);
		
		if(sname.length()>10) {
			
			compareString(sname);
		}
		
		else {
			
			reverseString(sname);
		}
		
//		String sname = String.join(" ", arr));
	}
}
