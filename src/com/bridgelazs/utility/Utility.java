
/******************************************************************************
*  Purpose: This is utility file which contains logic for files.
*   this file is having methods who can take input process it and
*   returns the output.
*
*  @author  priyanka gund
*  @version 1.0
*  @since   12-09-2019
*
******************************************************************************/
package com.bridgelazs.utility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	int result;
	static Scanner scanner = new Scanner(System.in);
	public static int Head = 0;
	public static int Tail = 0;
	public static int stake;
	public static int goal;
	public static int chance;
	public static int bet;
	private static int win, cash;
	private static long start;
	private static long stop;
	public static int count = 0;
	// public static int Tosscoin;

	public static int getInt() {
		int number = scanner.nextInt();
		return number;
	}

	public static String getStr() {
		String str = scanner.next();
		return str;
	}

	public static double getDouble() {
		double number = scanner.nextDouble();
		return number;
	}

	public static boolean getBoolean() {
		boolean number = scanner.nextBoolean();
		return number;
	}
	// **code for IntOpt operation**//

	public static void operation1(int a, int b, int c) {
		int result = 0, condition = 0;

		do {
			System.out.println("enter your choice");
			System.out.println(1 + " " + "a+b*c=" + 2 + " " + "a*b+c=" + 3 + " " + "c+a/b=" + 4 + " " + "a%b+c=" + 5
					+ " " + "default");
			result = getInt();
			switch (result) {

			case 1:
				result = a + b * c;
				System.out.println("a+b*c = " + result);
				break;
			case 2:

				result = a * b + c;
				System.out.println("a*b+c=" + result);
				break;

			case 3:

				result = c + a / b;
				System.out.println(+result);
				break;

			case 4:

				result = a % b + c;
				System.out.println("a%b+c=" + result);
				break;

			default:
				System.out.println("you enter wrong choice");
				break;
			}
			System.out.println("do you want to continue opration press 1 otherwise 0");
			// condition=Utility.getInt();

		} while (condition == 1);
		// return result;

	}

	// **code for quadratic equation**//

	public static void FindRoot(int a, int b, int c) {
		double root1, root2;

		Scanner scanner = new Scanner(System.in);

		double delta = b * b - 4 * a * c;

		if (delta > 0) {
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("the roots of quadratic equations are" + root1 + root2);
		} else if (delta == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.format("root1 = root2 = %.2f;", root1);
		}

		else {
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-delta) / (2 * a);
			System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart,
					imaginaryPart);
		}
	}

	// **code for flip coin **//

	public static boolean checkcode(int noOftime_Tosscoin) {

		if (noOftime_Tosscoin > 0)

		{
			return true;

		} else {
			System.out.println("please enter positive value");

			return false;

		}
	}

	public static void possibility(int noOftime_Tosscoin) {
		// Random r=new Random();
		for (int i = 0; i < noOftime_Tosscoin; i++) {
			if (Math.random() < 0.5) {

				Tail++;
			} else {
				Head++;
			}
		}
		System.out.println("number of tail possible for the Tail is " + noOftime_Tosscoin + " :" + Tail);
		System.out.println("number of head possible for the head is " + noOftime_Tosscoin + ":" + Head);
	}

	public static double percentage(int totalobs) {
		double per = 0.0;
		per = (Tail * 100) / totalobs;
		return per;
	}

	// power of 2

	public static boolean CheckCon(int N) {

		if (N > 0 && N < 31) {
			return true;
		}
		return false;
	}

	public static void PowerOf2(int N) {
		if (CheckCon(N)) {
			for (int i = 0; i < N; i++) {
				System.out.println("the power of 2 is 2^" + i + ":" + (int) (Math.pow(2, i)));
			}

		} else {
			System.out.println("invalid range");
		}

	}

	// **code for Harmonic series **//

	public static double nthHarmonic(double number) {
		double Hn = 0;
		// double i=1;
		if (number > 0) {
			System.out.println("harmonic series");
			for (double i = 1; i < number; i++)
				System.out.print("(1/" + i + ")+");

			for (double i = number; i > 1; i--) {
				double c = 1.0 / i;
				Hn = Hn + c;
			}
		} else
			System.out.println("invalid number");
		return Hn;
	}

	// ** code forDayofWeek**//

	public static void FindOutDay(int day, int month, int year) {
		int x;

		year = year - (14 - month) / 12;
		x = year + year / 4 - year / 100 + year / 400;
		month = month + 12 * ((14 - month)) / 12 - 2;
		day = (day + x + 31 * month / 12) % 7;
		System.out.println(day);
		if (day == 0)
			System.out.println("day is sunday ");

		else if (day == 1)
			System.out.println("day is monday ");

		else if (day == 2)
			System.out.println("day is tuesday ");

		else if (day == 3)
			System.out.println("day is wednesday ");

		else if (day == 4)
			System.out.println("day is thersday  ");

		else if (day == 5)
			System.out.println("day is friday");

		else if (day == 6)
			System.out.println("day is saturday ");

	}
	// **carLoan**//

	public static double MonthlyPayment(double Y, double P, double R) {
		double n = 12 * Y;
		double r = R / (12 * 100);

		double payment = (P * r) / (1 - Math.pow((1 + r), (-n)));
		return payment;

	}

	// ** code for Gambler**//

	public static void PlayGame(int cash, int goal, int chance) {
		int stake = cash;
		for (int i = 0; i < chance; i++) {
			if (cash > 0) {
				bet++;
				if (Math.random() < 0.5) {
					cash++;
					win++;
				} else
					cash--;

			}
			if (cash == goal) {
				System.out.println("you have achieve the goal" + cash);
				break;
			}

			if (cash == 0) {

				System.out.println("you lose the game" + cash);
			}
		}
		if (stake < cash && cash != goal) {
			System.out.println("you won the game but not achieve your goal" + cash);

		} else if (cash < stake) {
			System.out.println("you lose the game" + cash);
		}

		System.out.println("no of time she take a risk to achieve the goal" + bet);
		System.out.println("percentage of win the game" + (win * 100 / chance) + "%");
		System.out.println("percentage of lose the game" + (100 - ((win * 100) / chance)) + "%");

	}

	// ** code for trigonometric **//

	public static void TrigCalcu(double degree) {
		double radian = Math.toRadians(degree);

		double sinvalue = Math.sin(degree);
		double cosvalue = Math.cos(degree);
		System.out.println("Math.cos()" + Math.cos(degree));
		System.out.println("Math.cos()" + Math.sin(degree));

	}

	// **PrimeNumber**

	public static int[] FindPrime(int lower, int upper) {
		int i, j, count = 0;
		int[] array = new int[50];

		for (i = lower; i <= upper; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (j == i) {
				array[count++] = i;
			}

		}

		return array;
	}

	// ** code binarynumber**//

	public static int BinCon(int number) {
		int remender, binary = 0, i = 1;

		while (number > 0) {
			remender = number % 2;
			binary = binary + (remender * i);
			number = number / 2;
			i = (i * 10);

		}
		System.out.println("the binary number is" + binary);
		return binary;

	}

	// ** taylor series**//

	public static void convertan(double angle) {
		angle = angle % (2 * Math.PI);
		double term = 1.0;
		double sum = 0.0;

		for (int i = 1; term != 0; i++) {
			term = term * angle / i;

			if (i % 4 == 1)
				sum = sum + term;

			else if (i % 4 == 3)
				sum = sum - term;
		}
		System.out.println("the value is" + sum);

	}

	// ** RollofDia**//

	public static void MaximumTimeNumer(int number) {

		int SIDES = 6;
		int roll = (int) (Math.random() * SIDES) + 1;
		System.out.println("the maximum time fall number is" + roll);

	}

	// **repeated number Array**//

	public static void RepeatedNumber(int number, int array[]) {
		int i, j;
		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					// System.out.println("the repeated number is"+array[i]);
				}
			}
		}

	}

	// **secondsmallestSecondlargest**//

	public static void FindElement(int n, int arr[]) {
		int temp;

		for (int i = 0; i < n; i++) {
			arr[i] = Utility.getInt();
		}

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}

	}

	// ** PrimeFactor**//

	public static void PrimeFact(int no) {
		int temp = no;

		for (int i = 2; i * i < temp; i++) {
			while (no % i == 0) {
				System.out.println(i + "");
				no = no / i;
			}
		}
		if (no > 2) {
			System.out.println(no);
		}

	}

	// **permutation**//

	public static int Permutation(String str, int firstId, int lastId) {

		if (firstId == lastId) {
			count++;
			System.out.println(str);
		} else {
			for (int i = firstId; i < lastId; i++) {
				str = swap(str, firstId, i);
				Permutation(str, firstId + 1, lastId);
				str = swap(str, firstId, i);
			}

		}

		return count;
	}

	public static String swap(String str, int i, int j) {
		char temp;
		char[] b = str.toCharArray();
		temp = b[i];
		b[i] = b[j];
		b[j] = temp;
		return String.valueOf(b);
	}

	// ** permutationIteration**//
	public static void PermIteration(String str) {
		ArrayList<String> partial = new ArrayList<>(); // arraylist for store permu

		partial.add(String.valueOf(str.charAt(0))); // initialize list with first chara of string

		for (int i = 1; i < str.length(); i++) {

			for (int j = partial.size() - 1; j > 0; j++) {

				String str1 = partial.remove(j);

				for (int k = 0; k < str.length(); k++) {
					partial.add(str1.substring(0, k) + str.charAt(i) + str1.substring(k));

				}

			}

		}
		System.out.println(partial);

	}

	// ** Palindrome String**//

	public static void checkPalindrome(String str) {

		char[] strchar = str.toCharArray();
		String strreverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			strreverse = strreverse + strchar[i];
		}
		System.out.println("input string is:" + str);
		System.out.println("reverse string is:" + strreverse);

		if (str.equals(strreverse)) {
			System.out.println("String is palindrome");
		}

		else {
			System.out.println("string is not palindrome");
		}

	}

	// ** AnagramString **//

	public static boolean CheckString(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for (int i = 0; i < str1.length(); i++) {
			if (ch1[i] != ch2[i])

				return false;
		}
		return true;

	}

	// **InsertionSort**//

	public static String[] InsertionSort(String[] array) {
		String key;
		int i, j;
		for (i = 1; i < array.length; i++) {
			key = array[i];
			j = i - 1;
			while (j >= 0 && array[j].compareTo(key) > 0) {
				array[j + 1] = array[j];
				j = j - 1;

			}
			array[j + 1] = key;

		}
		return array;

	}

	/* Insertion sort for number */
	public static int[] InsertionSort(int[] array) {

		int i, j;
		for (i = 0; i < array.length; i++) {
			int p = array[i];
			j = i - 1;

			while (j >= 0 && array[j] > p) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = p;

		}
		return array;

	}

	public static void PrintArray(String[] array)

	{
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
	}

	public static int[] BubbleSort(int[] array) {
		int i, j, temp = 0;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < (array.length - 1 - i); j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}

		}
		return array;
	}

	public static String[] BubbleSortString(String[] array1) {
		int i, j;
		for (i = 0; i < array1.length; i++) {
			for (j = 0; j < (array1.length - 1 - i); j++) {
				String temp = null;
				if (array1[j].compareTo(array1[j + 1]) < 0) {
					temp = array1[j + 1];
					array1[j + 1] = array1[j];
					array1[j] = temp;
				}
			}
		}
		return array1;
	}

	public static void PrintArray(int[] array)

	{
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();

	}

	// **MagicNumber**//

	public static int FindMagicNo(int low, int high) {
		String userresponce;
		Scanner s = new Scanner(System.in);

		int mid = low + high / 2;

		if ((high - low) == 1)
			return low;

		System.out.println("is it your number less than " + mid);
		userresponce = s.next();

		if (userresponce.equals("true") || userresponce.equals("TRUE"))
			return FindMagicNo(low, mid);

		else
			return FindMagicNo(mid, high);

	}

	/** Leap Year For Condition */

	public static void CheckCondition(int year) {
		int count = 0;
		while (year > 0) {
			count++;
			year = year / 10;
		}
		if (count != 4) {
			System.out.println("year is invalid");
		}
	}

	public static boolean isleap(int year) {
		if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
			return true;
		}
		return false;

	}

	/** Triplets **/

	public static void TripletSum(int array[], int length) {
		int i, j, k;
		int count = 0;
		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length - 1; j++) {
				for (k = j + 1; k < length-2; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.println(" triplets are" + array[i] + " " + array[j] + " " + array[k]);
						count++;
					}

				}
			}
		}
		System.out.println("no of triplets are" + count);

	}

	/** StopWatch **/

	public static void StartStopWatch() {
		start = System.currentTimeMillis();
	}

	public static void EndStopWatch() {
		stop = System.currentTimeMillis();
	}

	public static double ElapsedTime() {
		double elapsedTime = (stop - start * 0.001);

		System.out.println("elapsed time in second=" + elapsedTime);
		return elapsedTime;
	}

	/* TwoD array */

	public static void IntegerArray(int row, int col) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter" + (row * col) + "for integer array");
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = getInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void DoubleArray(int row, int col) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter" + (row * col) + "for double array");
		double[][] arr = new double[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = getDouble();

			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void BooleanArray(int row, int col) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter" + (row * col) + "for boolean array");
		boolean[][] arr = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = getBoolean();

			}

		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	/* prime number between range */

	public static int[] IsPrimeNumber(int array[]) {

		int count1 = 0;
		int[] prime = new int[500];
		for (int i = 2; i < array.length; i++) {
			if (isPrime(array[i])) {
				prime[count1] = array[i];
				count1++;
			}
		}

		return prime;
	}

	public static boolean isPrime(int num) {
		if (num == 0 || num == 1)
			return false;
		else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0)
					return false;
			}
		}
		return true;
	}

	public static int[] IsAnagram(int[] primeArray) {
		int[] anagram = new int[200];
		int temp1, temp2;
		int count1 = 0;
		for (int i = 0; i < primeArray.length; i++) {
			temp1 = primeArray[i];
			for (int j = i + 1; j < primeArray.length; j++) {
				temp2 = primeArray[j];
				if (isAnagramCheck(temp1, temp2)) {
					anagram[count1] = temp1;
					anagram[++count1] = temp2;
					count1++;
					break;
				}

			}
		}

		return anagram;

	}

	public static boolean isAnagramCheck(int num1, int num2) {
		if (num1 < 10 || num2 < 10 || num1==num2) {
			return false;
		} else {

			char[] str1 = String.valueOf(num1).toCharArray();
			char[] str2 = String.valueOf(num2).toCharArray();
			if (str1.length != str2.length)
				return false;
			else {
				Arrays.sort(str1);
				Arrays.sort(str2);
				if (Arrays.equals(str1, str2))
					return true;
			}
			return false;
		}
	}
	/* vending Machine */

	public static void GetChange(int[] AvlNotes, int useramount) {
		int i = 0;

		while (useramount > 0) {
			if (useramount >= AvlNotes[i]) {
				int rs = 0;
				rs = useramount / AvlNotes[i];
				useramount = useramount % AvlNotes[i];
				System.out.println(rs + " Notes of " + AvlNotes[i]);

			}
			i++;
		}

	}

	public static void Merge(int array[], int li, int hi, int mi) {
		// defining subarray size//
		int n1 = mi - li + 1;
		int n2 = hi - mi;

		int[] LA = new int[n1];
		int[] RA = new int[n2];

		// inserting element in subarray//

		for (int i = 0; i < n1; i++) {
			LA[i] = array[i];

		}
		for (int i = 0; i < n2; i++) {
			RA[i] = array[mi + i + 1];

		}
		// merging element in array//
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < n1 && j < n2) {
			if (LA[i] <= RA[j]) {
				array[k] = LA[i];
				i++;
			} else {
				array[k] = RA[j];
				j++;
			}
		}

		// inserting reamaining element//

		while (i < n1) {
			array[k] = LA[i];
			i++;
			k++;
		}

		while (j < n1) {
			array[k] = RA[i];
			j++;
			k++;
		}

	}

	public static int[] sort(int[] a, int li, int hi) {
		while (li < hi) {
			int mi = (li + hi) / 2;
			sort(a, li, mi);
			sort(a, mi + 1, hi);
			Merge(a, li, hi, mi);
		}
		return a;
	}

	public static int[] IsPalindrome(int[] isPrime) {
		int[] pal = new int[1000];
		int count = 0;
		for (int i = 0; i < isPrime.length; i++) {
			if (Utility.IsPalindrome(isPrime[i])) {
				pal[count] = isPrime[i];
				count++;
			}

		}
		return pal;
	}

	private static boolean IsPalindrome(int i) {
		int r, sum = 0, temp;

		temp = i;
		while (i > 0) {
			r = i % 10;
			sum = (sum * 10) + r;
			i = i / 10;
		}
		if (temp == sum)
			return true;
		else
			return false;

	}

	public static int dayOfWeek(int day, int month, int year) {
		int x, year0, month0, day0;
		year0 = year - (14 - month) / 12;
		x = year0 + (year0 / 4) - (year0 / 100) + (year0 / 400);
		month0 = month + 12 * ((14 - month) / 12) - 2;
		day0 = (day + x + 31 * month0 / 12) % 7;
		return day0;
	}

	public static long factorial(long n) {
		long fact=1;
		for (long i = 1; i <= n; i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	

}
