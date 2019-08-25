package com.bridgelabz.function;

import java.util.Scanner;

public class LeapYear {
	public static int year;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		do {
		

			System.out.println("enter the year for checking is leap year or not");
			year = scanner.nextInt();
			

		} while (checkcode(year));
			
		isleap(year);
		
	}
	

	public static boolean checkcode(int year) {
		if (year > 1582) {
			return true;

		} else {
			System.out.println("please enter valid year");
			return false;

		}

	}

	public static void isleap(int year) {
		if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
			System.out.println("year is leap year");

		}

		else {
			System.out.println("year is not leap year");
		}

	}

}
