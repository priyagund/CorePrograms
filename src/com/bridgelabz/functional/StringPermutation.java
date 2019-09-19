package com.bridgelabz.functional;

import com.bridgelazs.utility.Utility;

public class StringPermutation
{
 public static void main(String[] args) 
 {
	int firstId=0, lastId, count;
	System.out.println("enter string");
	
	String str=Utility.getStr();
	lastId=(str.length()-1);
	
	
	count=Utility.Permutation(str,firstId,lastId);
	
	System.out.println("enter possible permutation");
	
	System.out.println("no of possible permutation is ="+count);
	
	
}
}





