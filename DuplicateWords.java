package com.vedait.corejavaproject.assignment.strings;

public class DuplicateWords {
		
	static void duplication(String s) {
		
		String sname = "";
		String[] sarrary = s.split(" ");
		
		for(int i =0; i<sarrary.length; i++) {
				
			for(int j=i+1; j<sarrary.length; j++) {
				
				if(sarrary[i].equals(sarrary[j])) {
					
					
					
					if(!(sname.contains(sarrary[i]))) {
						
						sname = sname+sarrary[i];
						
					}
				
				}
				
			}
			
		}
		
		System.out.println(sname);

		
	}
			
	
	public static void main(String[] args) {
		String s = "Hi Hello Hi Hi Hi";
//		System.out.println(s);
		duplication(s);
	}
	
}
