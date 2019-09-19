package com.bridgelabz.functional;

public class PrimeNumberBetRange
{
	public static void main(String[] args)
	{ 
		int i,j,count=0,f=0;
		
		int [] array=new int[200];
		
	  for(i=2;i<1000;i++) 
	   {
		  count=0;
		  for(j=2;j<i/2;j++)
		  {
			   if(i%j==0) {
				   count=1;
			   }
		  }
		  if(count==0) 
		  {
			 array[f]=i;
			 f++;
		}
	  }
	  for(j=0;array[j]!=0;j++)
	  System.out.print(" " + array[j]);
		
	}

}
