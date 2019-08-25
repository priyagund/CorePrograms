package com.bridgelabz.function;

import java.util.Scanner;

import com.bridgelazs.utility.Utility;

public class PrimeNumber 
{
public static void main(String[] args) 
{
	int lower,upper;
	int arrayofPrime[]=new int[50];
	System.out.println("Enter high and low");
   lower=Utility.getInt();
   upper=Utility.getInt();

   arrayofPrime=Utility.FindPrime(lower,upper);
   for(int i=0;arrayofPrime[i]!=0;i++)
   {
	   System.out.print(arrayofPrime[i]+" ");
   }
	
	//System.out.println("the prime number is");
}


}

