package com.bridgelabz.function;

import com.bridgelazs.utility.Utility;

public class DayOfWeek 
{
 public static void main(String[] args)
 {
	 int day=Integer.parseInt(args[0]);
	int month=Integer.parseInt(args[1]);
	int year=Integer.parseInt(args[2]);
	
	Utility.FindOutDay(day, month, year);
//System.out.println("the day of week is"+day);
}
 
}
