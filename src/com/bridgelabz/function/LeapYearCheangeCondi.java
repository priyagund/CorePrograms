package com.bridgelabz.function;

import com.bridgelazs.utility.Utility;

public class LeapYearCheangeCondi
{
  public static void main(String[] args) 
  {
	System.out.println("enter year for checking");
	int year=Utility.getInt();
	
	Utility.CheckCondition(year);
	
	if(Utility.isleap(year)) {
		System.out.println( year + " is leap year");
	}
	else {
		System.out.println(year+ " is not leap year");
	}
}
}
