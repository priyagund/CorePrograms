package com.bridgelabz.function;

import com.bridgelazs.utility.Utility;

public class HarmonicNumber
{
	public static double Hn;
public static void main(String[] args) 
{ 
	int number=Integer.parseInt(args[0]);
	
	
	Utility.nthHarmonic(number);
	//System.out.println("the nth harmonic number is "+Hn );
}
}
