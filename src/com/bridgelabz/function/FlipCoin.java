package com.bridgelabz.function;

import java.util.Scanner;

import com.bridgelazs.utility.Utility;

public class FlipCoin 
{
 public static int noOftime_Tosscoin;

public static void main(String[] args)
 {
	do{
		System.out.println("number of time flip the coin");
		noOftime_Tosscoin = Utility.getInt();
		 
	}while(!Utility.checkcode(noOftime_Tosscoin));
	
	 Utility.possibility(noOftime_Tosscoin);
	 double perTail=Utility.percentage(noOftime_Tosscoin);
	 
	 System.out.println("total percentage of tail "+perTail);
	 
	 System.out.println("total percentage of head" +(100-perTail));
	 
	  
}

}
