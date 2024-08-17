package com.vedait.corejavaproject.assignment.strings;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		
		StringBuilder  sb = new StringBuilder("This is a ");
		System.out.println(sb.capacity());
		System.out.println(sb.append("string builder object"));
		System.out.println(sb);
		
//		String s = new String("This is a ");
//		System.out.println(s.concat("String"));
//		System.out.println(s);

		System.out.println(sb.delete(0, 10));
		System.out.println(sb);
		
		System.out.println(sb.replace(0, sb.length(), "string"));
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());

		
	}
}
