package com.bridgelabz.functional;

import com.bridgelazs.utility.Utility;

public class PowerOf2 
{
public static void main(String[] args)
{   
	int N=Integer.parseInt(args[0]);
	
		System.out.println("enter the valid rangeof N");
		Utility.CheckCon(N);
		
		System.out.println("2's table");
        Utility.PowerOf2(N);
	
}
}
                                           