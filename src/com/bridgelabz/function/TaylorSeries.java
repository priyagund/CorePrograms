package com.bridgelabz.function;

import java.util.Scanner;

import com.bridgelazs.utility.Utility;

public class TaylorSeries 
{
public static void main(String[] args)
{  
	//Scanner scanner=new Scanner(System.in);
	// double angle=scanner.nextDouble();
	//double angle=Double.parseDouble(args[0]);
	// Utility.convertan(angle);
	//System.out.println("the value is");
	System.out.println("Enter the angle:");  
    int angle=Utility.getInt();
	Utility.convertan(angle);
	System.out.println("the value is");
	  
}
}
