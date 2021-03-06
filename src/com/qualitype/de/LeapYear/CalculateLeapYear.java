package com.qualitype.de.LeapYear;

import java.util.ArrayList;
import java.util.List;

public class CalculateLeapYear {

	public static void main(String[] args) {
		List<Integer> leapYears = new ArrayList<Integer>();
		for (int i = 1800; i < 2401; i++) {
			leapYears.add(i);
		}
		for (Integer integer : leapYears) {
			System.out.println(integer + " : " + isLeapYear(integer));
		}

	}
	
	private static boolean isLeapYear(int year) {
		if(year % 400 == 0) return true;
		if(year % 100 == 0) return false;
		if (year % 4 == 0) return true;
		
		return false;
	}

}
