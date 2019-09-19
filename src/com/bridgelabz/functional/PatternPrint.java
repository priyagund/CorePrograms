package com.bridgelabz.functional;

public class PatternPrint 
{
  public static int k=10;
  
 public static void main(String[] args) 
 {
	int i,j,count;
	 for(i=0;i<9;i++)
	 {   count=0;
		 if(i>4)
		 {
			k=k+2;	 
		 }
		 else
		 {
			k=k-2;
		 }	 
		 for(j=0;j<13;j++)
		 {
			if((j<=1||j>k+1)&& count<5) {
				System.out.print("*");
				count++;
			}
			else
			{
				System.out.print(" ");
			}
			 
		 }
		 System.out.println();
		 
	 }
	
	
}
}
