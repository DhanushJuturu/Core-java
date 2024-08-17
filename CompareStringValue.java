package com.vedait.corejavaproject.assignment.strings;

public class CompareStringValue {

	void compareString(String sname) {
		
		char[] ar = sname.toCharArray();
		
		for(int i=sname.length()-1; i>=0; i--) {
			
			System.out.print(ar[i]);
		}
	}
	
	public static void main(String[] args) {
		
		String sname = "I love programming";
		CompareStringValue c1 = new CompareStringValue();
		c1.compareString(sname);
	}
}
