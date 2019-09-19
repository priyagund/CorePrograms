package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelazs.utility.Utility;

public class SqureRoot
{
public static void main(String[] args) 
{
	//double c=Double.parseDouble(args[0]);
Scanner scanner=new Scanner(System.in);
 double c=scanner.nextDouble();
		double t=c;
		double epsilon=1.0e-15;
		
		while(Math.abs(t-c/t)>epsilon*t){
			
			t=(c/t+t)/2.0;
		System.out.println(t);
	}
}
}
