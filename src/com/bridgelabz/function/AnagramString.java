package com.bridgelabz.function;

import com.bridgelazs.utility.Utility;

public class AnagramString 
{
 public static void main(String[] args)
 {  
	System.out.println("enter string for checking anagram");
	System.out.println("enter first string");
	String str1=Utility.getStr();
	
	System.out.println("enter second string");
	String str2=Utility.getStr();
	
	if(Utility.CheckString(str1,str2)){
		System.out.println("string is anagram");
	}
	else
		System.out.println("string is not anagram");
	
}
}
