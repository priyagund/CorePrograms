package com.bridgelabz.function;
import java.util.*;
public class TikTakToe {
	
	public static void win(char[][] a)
	{
		if((a[0][0]=='0' && a[0][1]=='0' && a[0][2]=='0') || 
				(a[1][0]=='0' && a[1][1]=='0' && a[1][2]=='0') ||
				(a[2][0]=='0' && a[2][1]=='0' && a[2][2]=='0') ||
				(a[0][0]=='0' && a[1][1]=='0' && a[2][2]=='0') ||
				(a[0][2]=='0' && a[1][1]=='0' && a[2][0]=='0') ||
				(a[0][0]=='0' && a[1][0]=='0' && a[2][0]=='0') ||
				(a[0][1]=='0' && a[1][1]=='0' && a[2][1]=='0') ||
				(a[0][2]=='0' && a[1][2]=='0' && a[2][2]=='0'))
		{
			System.out.println("User won");
			
		}
		else if((a[0][0]=='X' && a[0][1]=='X' && a[0][2]=='X') || 
				(a[1][0]=='X' && a[1][1]=='X' && a[1][2]=='X') ||
				(a[2][0]=='X' && a[2][1]=='X' && a[2][2]=='X') ||
				(a[0][0]=='X' && a[1][1]=='X' && a[2][2]=='X') ||
				(a[0][2]=='X' && a[1][1]=='X' && a[2][0]=='X') ||
				(a[0][0]=='X' && a[1][0]=='X' && a[2][0]=='X') ||
				(a[0][1]=='X' && a[1][1]=='X' && a[2][1]=='X') ||
				(a[0][2]=='X' && a[1][2]=='X' && a[2][2]=='X'))
		{
			System.out.println("System won");
		}	
		else
		{
			System.out.println("Game is Draw");
		}
	}

	public static void main(String[] args) {
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		char[][] a= {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		int x=0,y=0;
		int toss=rand.nextInt(2);
		if(toss==0)
		{
			//System turn
			System.out.println("System turn");
			int row=rand.nextInt(3);
			int col=rand.nextInt(3);
			a[row][col]='X';
			//printing board
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			//user turn
			x=1;
			System.out.println();
			System.out.println("User turn");
			System.out.println("Enter row number");
			int row=sc.nextInt();
			System.out.println();
			System.out.println("Enter column number");
			int col=sc.nextInt();
			a[row][col]='0';
			//printing game board
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		for(int i=0;i<4;i++)
		{
			if(x==0)
			{
				//User turn now
				System.out.println("User turn");
				System.out.println("Enter row number");
				int row=sc.nextInt();
				System.out.println();
				System.out.println("Enter column number");
				int col=sc.nextInt();
				//checking if place is vacant
				if((a[row][col])!='X' || (a[row][col])!='0')
					a[row][col]='0';
				else 
				{
					//while place is vacant,generate new place
					while((a[row][col])!='X' || (a[row][col])!='0')
					{
						System.out.println("This place is not vancant,think of another place");
						System.out.println("Enter row number");
						row=sc.nextInt();
						System.out.println();
						System.out.println("Enter column number");
						col=sc.nextInt();
					}
					a[row][col]='0';
				}
				//printing board
				for(int j=0;j<3;j++)
				{
					for(int k=0;k<3;k++)
					{
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
				win(a);
				//system turn
				System.out.println("System turn");
				row=rand.nextInt(3);
				col=rand.nextInt(3);
				if((a[row][col])!='X' || (a[row][col])!='0')
					a[row][col]='X';
				else
				{
					////while place is vacant,generate new place
					while((a[row][col])!='X' || (a[row][col])!='0')
					{
						row=rand.nextInt(3);
						col=rand.nextInt(3);
					}
					a[row][col]='X';
				}
				//printing board
				for(int k=0;k<3;k++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
				win(a);
			}
		
		
			else
			{
				//system turn
				System.out.println("System turn");
				int row=rand.nextInt(3);
				int col=rand.nextInt(3);
				if((a[row][col])!='X' || (a[row][col])!='0')
					a[row][col]='X';
				else
				{
					//while place is vacant,generate new place
					while((a[row][col])!='X' || (a[row][col])!='0')
					{
						row=rand.nextInt(3);
						col=rand.nextInt(3);
					}
					a[row][col]='X';
				}
				//printing board
				for(int k=0;k<3;k++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
				//user turn
				System.out.println("User turn");
				System.out.println("Enter row number");
				row=sc.nextInt();
				System.out.println();
				System.out.println("Enter column number");
				col=sc.nextInt();
				if((a[row][col])!='X' || (a[row][col])!='0')
					a[row][col]='0';
				else 
				{
					//while place is vacant,generate new place
					while((a[row][col])!='X' || (a[row][col])!='0')
					{
						System.out.println("This place is not vancant,think of another place");
						System.out.println("Enter row number");
						row=sc.nextInt();
						System.out.println();
						System.out.println("Enter column number");
						col=sc.nextInt();
					}
					a[row][col]='0';
				}
				//printing board
				for(int j=0;j<3;j++)
				{
					for(int k=0;k<3;k++)
					{
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
				
			}
		
		}
	}

}
