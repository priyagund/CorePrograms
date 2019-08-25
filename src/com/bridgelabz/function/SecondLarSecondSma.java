package com.bridgelabz.function;

import com.bridgelazs.utility.Utility;

public class SecondLarSecondSma
{
	public static void main(String[] args) 
	{
		 System.out.println("enter number of element you enter");
		 int n=Utility.getInt();
		 
		 System.out.println("enter the element");
         int[] arr=new int[n];
         
		 Utility.FindElement( n, arr);
		 
		  System.out.println("second largest"+arr[n-2]);
	      System.out.println("second smallest"+arr[1]);  //index start with a[0]
	      
	   
		 
  
	}

}
