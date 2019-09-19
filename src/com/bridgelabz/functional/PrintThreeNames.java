package com.bridgelabz.functional;

import java.util.Scanner;

public class PrintThreeNames
{
  public static void main(String[] args) 
  {
	String[] str=new String[4];
	System.out.println("enter Three name at last add hi also");
	for(int i=0;i<str.length;i++)
	{	
	  
	  Scanner scanner=new Scanner(System.in);
	  str[i]=scanner.next();
	}
	  
	for(int i=str.length-1;i>=0;i--)
	{
		System.out.println(str[i]);
	}

  }

}