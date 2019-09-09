package com.bridgelabz.function;

import com.bridgelazs.utility.Utility;

public class HarmonicNumber
{
	public static double Hn;
public static void main(String[] args) 
{ 
	double number=Double.parseDouble(args[0]);
	 double result=Utility.nthHarmonic(number);
	System.out.println("the nth harmonic is "+result);
}
}
