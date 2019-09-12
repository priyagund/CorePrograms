package com.bridgelabz.algorithm;

import com.bridgelazs.utility.Utility;

public class MagicNumber
{
  public static void main(String[] args) 
  {
	double n=Integer.parseInt(args[0]);
	int endRange=(int) Math.pow(2,n);
	
	System.out.println("think the range between 0 to"+endRange);
	
	System.out.println("ask few questionto user and ans is in true or false");
	
	int MagicNumber=Utility.FindMagicNo(0,endRange);
	System.out.println("your magic number is"+MagicNumber);
}
}
