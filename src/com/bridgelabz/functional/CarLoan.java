package com.bridgelabz.functional;

import com.bridgelazs.utility.Utility;

public class CarLoan
{
 public static void main(String[] args)
 {
	 
	double P=Double.parseDouble(args[0]);
	double Y=Double.parseDouble(args[1]);
	double R=Double.parseDouble(args[2]);
	double payment=Utility.MonthlyPayment(P,Y,R);
	System.out.println("monthly payment is"+payment);

	
 }
}
