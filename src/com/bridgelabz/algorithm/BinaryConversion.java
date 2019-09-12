package com.bridgelabz.algorithm;
import java.util.*;
public class BinaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int[] a=new int[32];
		int i=31;
		
		while(num>0)
		{
			a[i]=num%2;
			num=num/2;
			i--;
		}
		System.out.println("Binary Number is :");
		for (int j = 0; j < 32; j++) {
			System.out.print(a[j]);
		}
		System.out.println();
		
		//Swapping
		int temp=0;
		for (int j = 0; j < 28; j++) {
			temp=a[j];
			a[j]=a[j+4];
			a[j+4]=temp;
			
			if(j==3 || j==11 || j==19)
			{
				j=j+4;
			}
		}
		System.out.println("Swapped Binary Number is :");
		//print Swapped Binary NUmber
		for (int j = 0; j < 32; j++) {
			System.out.print(a[j]);
		}
		int c=0;
		for (int j = 31; j < a.length; j++) {
			c=c+a[j]*(int)(Math.pow(2, j));
		}
	}

}