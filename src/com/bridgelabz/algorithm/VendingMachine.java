package com.bridgelabz.algorithm;

import com.bridgelazs.utility.Utility;

public class VendingMachine
{
    public static void main(String[] args) 
    {    int[] AvlNotes=new int[] {1000,500,100,50,10,5,2,1};
		
		System.out.println("enter amount which you want to change");
		int useramount=Utility.getInt();
		
		Utility.GetChange(AvlNotes, useramount);
	}
}
