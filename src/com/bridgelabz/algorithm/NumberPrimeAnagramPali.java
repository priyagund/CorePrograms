package com.bridgelabz.algorithm;

import com.bridgelazs.utility.Utility;

public class NumberPrimeAnagramPali 
{
 public static void main(String[] args)
 {
	int[] array=new int[1000];
	for (int i = 0; i < array.length; i++) {
		array[i]=i;
	}
	int[] IsPrime=new int[200];
	int[] IsAnagram=new int[50];
	int[] IsPAlindrome=new int[20];
	IsPrime=Utility.IsPrimeNumber(array);
	IsAnagram=Utility.IsAnagram(IsPrime);
	IsPAlindrome=Utility.IsPalindrome(IsPrime);
	printArray1(IsPrime);
	System.out.println();
	printArray2(IsAnagram);
	System.out.println();
	printArray3(IsPAlindrome);
	
}
 public static void printArray1(int[] IsPrime) {
	 for (int i = 0; IsPrime[i]!=0; i++) {
		System.out.print(IsPrime[i]+" ");
	}
 }
	 public static void printArray2(int[] IsAnagram) {
		 for (int i = 0; IsAnagram[i]!=0; i++) {
			System.out.print(IsAnagram[i]+" ");
		}
 }
	 public static void printArray3(int[] IsPAlindrome) {
		 for (int i = 0; IsPAlindrome[i]!=0; i++) {
			System.out.print(IsPAlindrome[i]+" ");
		}
 }
}
