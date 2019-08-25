package com.bridgelabz.function;

import java.util.Scanner;

import com.bridgelazs.utility.Utility;

public class IntOptOperation 
{
public static void main(String[] args) 
{
     int a,b,c;
  
	System.out.println("enter three integer number");
	a=Utility.getInt();
	b=Utility.getInt();
	c=Utility.getInt();
	
	 Utility.operation1( a,b,c);
	//int result = Utility.operation1( a,b,c);
	//System.out.println("Result in main:"+result);
	
}
}
