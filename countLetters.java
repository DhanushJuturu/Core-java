package com.vedait.corejavaproject.assignment.strings;

public class countLetters {
	
	static void count(String s1) {
		
		int letter=0, space = 0, num = 0, other = 0;
		
		char[] arr = s1.toCharArray();
		
		for(int i=0; i<=s1.length()-1; i++) {
			
			if(Character.isAlphabetic(arr[i])) {
				
				letter++;
			}
			
			else if(Character.isSpaceChar(arr[i])) {
				
				space++;
			}
			
			else if(Character.isDigit(arr[i])) {
				
				num++;
			}
			
			else { 
				
				other++;
			}
			
		}
		
		System.out.println("Letters : "+letter+"\nSpaces : "+space+"\nNumbers : "+num+"\nSpecial Charcters : "+other);

	}
	
	public static void main(String[] args) {
		
		String s1 = "My friend instaid is reddy@2k2_#J";
		count(s1);
	}
}
