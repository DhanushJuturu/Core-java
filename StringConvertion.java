package com.vedait.corejavaproject.assignment.strings;

public class StringConvertion {
	
	void convertion(String s1) {
		
		String[] s2 = s1.split("-");
		
		for(int i=0; i<s2.length; i++) {
			
			System.out.println(s2[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		String s1 = "Rose is a flower-it lives one hour-but-Friendship is river-it flows forever";
		
		StringConvertion sc = new StringConvertion();
		sc.convertion(s1);
	}
}
