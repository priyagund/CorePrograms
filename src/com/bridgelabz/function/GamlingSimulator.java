package com.bridgelabz.function;

import com.bridgelazs.utility.Utility;

public class GamlingSimulator{
 public static void main(String[] args) 
 {
	 int stake,goal,chance;
	 System.out.println("how much money you have please enter");
	 stake=Utility.getInt();
	 
	 System.out.println("how much money  you want to win");
	 goal=Utility.getInt();
	 
	 System.out.println("how many time you take a chance");
	 chance=Utility.getInt();
	 Utility.PlayGame(stake,goal,chance);
			 
	
}
 

}
