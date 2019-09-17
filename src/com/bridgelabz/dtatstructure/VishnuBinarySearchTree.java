package com.bridgelabz.dtatstructure;
import java.util.Scanner;

import com.bridgelazs.utility.Utility;
public class VishnuBinarySearchTree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n=sc.nextInt();
		long result=(long) ((Utility.factorial(2*n)/(Utility.factorial(n+1)*Utility.factorial(n)))%(Math.pow(10, 8)+7));
		System.out.println(result);
	}

}
