package com.bridgelabz.functional;

import java.util.Scanner;

public class TemperatureConversion 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter temperature in celsious:");
		float fahrenheit=scanner.nextFloat();
		
		System.out.println("enter temperature in fahrenheit:");
		float celsious=scanner.nextFloat();
        
	  System.out.println("celsious to fahrenheit:" +fahrenheit);
	  fahrenheit=(celsious*9/5)+32;
	  
	  System.out.println("fahrenheit to celsious:" +celsious);
	  celsious=(fahrenheit-32)*5/9;
	 
	  
	}
}
