package com.bridgelabz.dtatstructure;

import com.bridgelazs.utility.Utility;

public class AnagramTwoDarray
{
    public static void main(String[] args) 
    {
    	int[] array=new int[1000];
    	int[] IsPrime=new int[200];
    	int[][] IsNotAnagram=new int[2][50];
    	for (int i = 0; i < array.length; i++) {
    		array[i]=i;
    	System.out.print(" "+array[i]);	
    	}
    	
    	for(int i=0;IsPrime[i]!=0;i++) 
    	{
    		IsPrime=Utility.IsPrimeNumber(array);
    		System.out.println(IsPrime[i]+" ");
    		
    	}	
    	
    	
    	
		
    		 
}
}