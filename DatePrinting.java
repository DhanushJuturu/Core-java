package com.vedait.corejavaproject.assignment.strings;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinting {
	
	static void printDate() {
		
		Date date = new Date();
		SimpleDateFormat sdFormat = new SimpleDateFormat("YYYY/MM/dd/DD/u");
		System.out.println(date);
		System.out.println(sdFormat.format(date));
		
		
	}
	
	public static void main(String[] args) {
		printDate();
		
	}
}
