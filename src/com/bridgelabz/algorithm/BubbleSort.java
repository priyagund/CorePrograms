package com.bridgelabz.algorithm;

import com.bridgelazs.utility.Utility;

public class BubbleSort
{
  public static void main(String[] args)
  {
	int[] array=new int[5];
	String[] array1=new String[5];
	System.out.println("enter the element in array");
	
	for(int i=0;i<array.length;i++)
	{
		array[i]=Utility.getInt();
	}
	System.out.println("enter strings into array");
	for(int i=0;i<array1.length;i++) {
		array1[i]=Utility.getStr();
			
	}
	
	System.out.println("before bubble sort");
	Utility.PrintArray(array);
	
	Utility.BubbleSort(array);
	System.out.println("after insertion");
    Utility.PrintArray(array);
    
    /*for string */
	System.out.println("String before bubble sort");
	Utility.PrintArray(array1);
	
	Utility.BubbleSortString(array1);
	System.out.println("String after bubble sort");
    Utility.PrintArray(array1);
    
}
}
