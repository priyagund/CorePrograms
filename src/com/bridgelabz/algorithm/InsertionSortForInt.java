package com.bridgelabz.algorithm;

import com.bridgelazs.utility.Utility;

public class InsertionSortForInt 
{
public static void main(String[] args) 
{
	int[] array=new int[7];
	String[] str=new String[5];
	System.out.print("enter array element for sorting");
    for(int i=0;i<6;i++)
    {
    	array[i]=Utility.getInt();
    }
	System.out.println("enter 5 string as element in array for sorting");
	
	for(int j=0;j<str.length;j++){
		str[j]=Utility.getStr();
	 }
	System.out.print("before insertionsort");
	
	Utility.InsertionSort(array);
	System.out.print("array element after sort" );
	Utility.PrintArray(array);
    
	/*insertion for string*/

	System.out.println("before insertion sort");
	 Utility.PrintArray(str);
	 
	 Utility.InsertionSort(str);
	 System.out.println("after insertion sort");
	 Utility.PrintArray(str);
	 
}
}
	
	

