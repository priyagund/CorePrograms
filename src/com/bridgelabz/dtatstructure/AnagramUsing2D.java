
/******************************************************************************
* 
 Purpose:  Anagram number using 2D Array
*
*  @author  Priyanka gund
*  @version 1.0
*  @since   13-09-2019
*
******************************************************************************/package com.bridgelabz.dtatstructure;

import com.bridgelazs.utility.Utility;

public class AnagramUsing2D {
	public static void main(String[] args) {
		int[][] anagram = new int[10][];
		int[][] nonanagram = new int[10][];

		int start = 0, end = 100, count1 = 0, count2 = 0, x = 0;

		//checking anagram number
		for (int i = 0; i < 10; i++) {

			for (int j = start; j < end; j++) {
				if (Utility.isPrime(j)) {
					for (int j2 = 0; j2 < 1000; j2++) {
						if (Utility.isPrime(j2)) {
							x = 0;
							if (Utility.isAnagramCheck(j2, j)) {
								count1++;
								x = 1;
								break;
							}
						}

					}
					if (x == 0) {
						count2++;
					}
				}

			}
			// count anagram number and adding in array
			anagram[i] = new int[count1];
			nonanagram[i] = new int[count2];
			count1 = 0;
			count2 = 0;
			start = end + 1;
			end = end + 100;
		}
		
		// adding anagram and nonanagram in 2D array
		start = 0; end = 100; count1 = 0; count2 = 0; x = 0;

		for (int i = 0; i < 10; i++) {

			for (int j = start; j < end; j++) {
				if (Utility.isPrime(j)) {
					for (int j2 = 0; j2 < 1000; j2++) {
						if (Utility.isPrime(j2)) {
							x = 0;
							if (Utility.isAnagramCheck(j2, j)) {
								anagram[i][count1]=j;
								count1++;
								x = 1;
								break;
							}
						}

					}
					if (x == 0) {
						nonanagram[i][count2]=j;
						count2++;
					}
				}

			}
			
			count1 = 0;
			count2 = 0;
			start = end + 1;
			end = end + 100;
		}
		
		//printing arrays
		System.out.println("Prime nonAnagram numbers are :");
		for (int i = 0; i < nonanagram.length; i++) {
			for (int j = 0; j < nonanagram[i].length; j++) {
				System.out.print(nonanagram[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Prime Anagram numbers are :");

		for (int i = 0; i < anagram.length; i++) {
			for (int j = 0; j < anagram[i].length; j++) {
				System.out.print(anagram[i][j]+" ");
			}
			System.out.println();
		}
	}

}
