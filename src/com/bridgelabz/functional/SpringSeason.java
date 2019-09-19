package com.bridgelabz.functional;

public class SpringSeason
{ 
   public static void main(String[] args) 
   {
	 
	 int day=Integer.parseInt(args[0]);
	 int month=Integer.parseInt(args[1]);
	 
	 if(day>=20 && day<=31&& month==3)
		 System.out.println("true");
	 else if(day>=1 &&day<=30 && month==4)
		 System.out.println("true");
	 else if(day>=1 && day>31 && month==5)
		 System.out.println("true");
	 else if(day>=1 && day<=20 && month==6)
		 System.out.println("true");
	 else
		 System.out.println("it's not between march to june");
		
   }
	
   

}