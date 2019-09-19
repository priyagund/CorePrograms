package com.bridgelabz.functional;

import com.bridgelazs.utility.Utility;

public class Triplets
{
 public static void main(String[] args) 
 {  
	System.out.println("enter size of array ");
	int N=Utility.getInt();
	System.out.println("enter number of element in array");
	int[] array=new int[N];
	int l=array.length;
	for(int i=0;i<N; i++) {
		array[i]=Utility.getInt();
	}
	Utility.TripletSum(array,l);
}
}
