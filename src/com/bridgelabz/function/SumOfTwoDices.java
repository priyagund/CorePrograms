package com.bridgelabz.function;

public class SumOfTwoDices
{
	public static void main(String[] args) 
	{
		int SIDES = 6;
		int sum;
		
		int a=(int) (1+(Math.random())*SIDES);
		int b=(int) (1+(Math.random())*SIDES);
		
		System.out.println("value of a and b is" +a+ " " +b );
		sum=a+b;
		System.out.println("sum of two random integer is"+sum);
	}	
    
		
}		   
	



