package com.bridgelazs.utility;

public class OopsUtility
{
 
	public static void showCards(String[][]player) 
	{
		for(int i=0;i<player.length;i++)
		{
			for(int j=0;j<player[i].length;j++) 
			{
				player[i][j]=player[i][j].replaceAll("11","jack" );
				player[i][j]=player[i][j].replaceAll("12","queen" );
				player[i][j]=player[i][j].replaceAll("13","king" );
				player[i][j]=player[i][j].replaceAll("14","Ace" );
				System.out.println(player[i][j]);
			}
		}
		for(int i=0;i<player.length;i++) 
		{
			for(int j=0;j<player[i].length;j++) 
			{
				System.out.println(player[i][j]);
			}
		}
			System.out.println();
			
			
	}
}
