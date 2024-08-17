package com.vedait.corejavaproject.assignment.strings;

public class CountCharacters {
	
	static int count=0;
	
	static void charCount(String s1) {
		
		char[] arr = s1.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			
			count=1;
			
			if(Character.isSpaceChar(arr[i]))
				continue;
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					count++;
					arr[j]=' ';
				}
				
			}
			
			System.out.println(arr[i]+" - "+count+"times");
			
		}
				
	}
	
	public static void main(String[] args) {
		
		String s1 = "Hi Hello";
		charCount(s1);
		
	}
	
}
