package com.bridgelabz.datastructure;

import com.bridgelazs.utility.Utility;

public class BubbleSort
{
  public static void main(String[] args)
  {
	int[] array=new int[5];
	System.out.println("enter the element in array");
	
	for(int i=0;i<array.length;i++)
	{
		array[i]=Utility.getInt();
	}
	System.out.println("before bubble sort");
	Utility.PrintArray(array);
	
	Utility.BubbleSort(array);
	System.out.println("after insertion");
    Utility.PrintArray(array);
    
}
}
