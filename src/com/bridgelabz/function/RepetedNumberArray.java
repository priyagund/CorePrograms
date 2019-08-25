package com.bridgelabz.function;

import com.bridgelazs.utility.Utility;

public class RepetedNumberArray
{
	public static void main(String[] args) {
		int[] array=new int[100];
		int number=Utility.getInt();
		
		System.out.println("the repeated number is");
		Utility.RepeatedNumber(number,array);
		

	}
}
