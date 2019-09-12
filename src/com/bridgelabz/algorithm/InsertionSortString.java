package com.bridgelabz.algorithm;

import com.bridgelazs.utility.Utility;

public class InsertionSortString 
{
 public static void main(String[] args) 
 {
	String[] str=new String[5];
	System.out.println("enter 5 string as element in array for sorting");
	
	for(int i=0;i<str.length;i++){
		str[i]=Utility.getStr();
	 }
	System.out.println("before insertion sort");
	 Utility.PrintArray(str);
	 
	 Utility.InsertionSort(str);
	 System.out.println("after insertion sort");
	 Utility.PrintArray(str);
	 
}
}
