package com.bridgelabz.function;


import com.bridgelazs.utility.Utility;

public class QuadraticEq 
{
 public static void main(String[] args)
 {
   int a,b, c;
   System.out.println("enter value of coefficient a,b,c");
 
   do{
	   a=Utility.getInt();
	    b=Utility.getInt();
	   c=Utility.getInt();
     } while(a==0 && b==0);
   
	
	Utility.FindRoot(a, b, c);
}
}
