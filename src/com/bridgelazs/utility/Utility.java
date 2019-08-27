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

	// public static int Tosscoin;

	public static int getInt() {
		int number = scanner.nextInt();
		return number;
	}
	

	public static String getStr() {
		String str = scanner.next();
		return str;
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

	public static void powerOf2(int number) {

		for (int i = 0; i < number; i++) {
			System.out.println("the power of 2 is 2^" + i + ":" + (int) (Math.pow(2, i)));
		}

	}

	// **code for Harmonic series **//

	public static void nthHarmonic(int number) {
		double Hn = 0;
		System.out.println("harmonic series");
		for (int i = 1; i < number; i++) {
			Hn = Hn + (1.0 / i);
			if (i < number)
				System.out.println("(1/" + i + ")+");

			else
				System.out.println("(1/" + i + ")=");

		}
		System.out.println("the  nth harmonic number is " + Hn);

	}

	// ** code forDayofWeek**//

	public static int FindOutDay(int day, int month, int year) {
		int x;

		year = year - (14 - month) / 12;
		x = year + year / 4 - year / 100 + year / 400;
		month = month + 12 * ((14 - month)) / 12 - 2;
		day = (day + x + 31 * month / 12) % 7;

		if (day == 0)
			System.out.println("day of week is sunday");

		else if (day == 1)
			System.out.println("day of week is monday");
		else if (day == 2)
			System.out.println("day of week is tuesday");

		else if (day == 3)
			System.out.println("day of week is wedensday");

		else if (day == 4)
			System.out.println("day of week is thersday");
		else if (day == 5)
			System.out.println("day of week is friday");
		else if (day == 6)
			System.out.println("day of week is saturday");
		return day;
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

				System.out.println("you lose the game" +  cash);
			}
		}
		if (stake < cash && cash != goal) {
			System.out.println("you won the game but not achieve your goal" + cash);

		} else if (cash < stake) {
			System.out.println("you lose the game" + cash);
		}

		System.out.println("no of time she take a risk to achieve the goal"+ bet);
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
		int i,j,count=0;
		int[] array =new int[50];
		
		for(i=lower;i<=upper;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(j==i)
			{
			array[count++]=i;
			}
				
		}
		
		return array;	
		}
	



       //** code binarynumber**//


public static int BinCon(int number)
{
	int remender,binary=0,i=1;
	
	while(number>0)
	{
		remender=number%2;
		binary=binary+(remender*i);
		number=number/2;
		i=(i*10);
		
	}
	System.out.println("the binary number is"+binary);
	return binary;
	
	
}
	
	
	//** taylor series**//
	
	
 public static void convertan( double angle)
 {
  angle=angle%(2*Math.PI);
  double term=1.0;
  double sum=0.0;
  
  for( int i=1;term!=0;i++)
  {
	  term=term*angle/i;
       
	  if(i%4==1)
		  sum=sum+term;
	  
	  else if(i%4==3)
		  sum=sum-term;
  }
   System.out.println("the value is"+sum);
	  
  }
	 
 
       //** RollofDia**//
 
 
 public static void MaximumTimeNumer(int number)
 {
	 
	int SIDES=6;
	int roll=(int)(Math.random()*SIDES)+1;
	System.out.println("the maximum time fall number is"+ roll);
	 
 }
 
 
     //**repeated number Array**//
 
 
 public static void RepeatedNumber(int number, int array[])
 {
	 int i,j;
	 for(i=0;i<array.length;i++)
	 {
		 for(j=i+1;j<array.length;j++)
		 {
			 if(array[i]==array[j])
			 {
				 //System.out.println("the repeated number is"+array[i]);
			 }
		 }
	 }
	 
 }
 
 

       //**secondsmallestSecondlargest**//
 

 public static void FindElement(int n, int arr[])
 {
	 int temp;
	
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=Utility.getInt();
	 }
	 
	 for(int i=0;i<n;i++){
		 
		 for(int j=i+1;j<n;j++)
		 {
			 if(arr[i]>arr[j]){
				 temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				 
			 }
		
		 }
	 }
	 
	
 }


	     //** PrimeFactor**//
 
 public static void PrimeFact(int no)
 {
	 int temp=no;
	 
	 for(int i=2;i*i<temp;i++)
	 {
		 while(no%i==0)
		 {
			 System.out.println(i+"");
			 no=no/i;
		 }
	 }
	if(no>2){
			System.out.println(no);
		}
		
 }

 
         //**permutation**//
 


 
 
public static int permutation(String str,int firstId,int lastId)
{
    int count=0;
    if(firstId==lastId){
	 
	 count++;
	 System.out.println(str);
}
 else
 {
	 for(int i=firstId;i<lastId;i++)
	 {
		 str=swap(str,firstId,i);
		 permutation(str,firstId+1,lastId);
		 str=swap(str,firstId+1,i); 
	}
	 
 }

return count;
} 
public static String swap(String str,int i,int j)
{
   char temp;
   char[]b=str.toCharArray();
   temp=b[i];
   b[i]=b[j];
   b[j]=temp;
   return String.valueOf(b);
}
 
 

   //** permutationIteration**//
public static void PermIteration(String str)
{
	ArrayList<String>partial=new ArrayList<>(); //arraylist for store permu
	
	partial.add(String.valueOf(str.charAt(0)));  //initialize list with first chara of string
	
	for( int i=1;i<str.length();i++){
		
		for(int j=partial.size()-1;j>0;j++){     
			
			String str1=partial.remove(j);
			
			for(int k=0;k<str.length();k++)
			{
			   partial.add(str1.substring(0,k)+str.charAt(i)+str1.substring(k));
			   
			}
			
		}
		
	}
	System.out.println(partial);
	
} 
 
        //** Palindrome String**//
 

 public static void checkPalindrome(String str){
	 
	 char[] strchar=str.toCharArray();
	String strreverse="";
	 
	 for(int i=str.length()-1;i>=0;i--)
	 {
		 strreverse=strreverse+strchar[i];
	 } 
	 System.out.println("input string is:" + str);
	 System.out.println("reverse string is:" + strreverse);
	 
	 if(str.equals(strreverse))
	 {
		 System.out.println("String is palindrome");
	 }
	 
	 else{
		 System.out.println("string is not palindrome");
	 }
	 
 }
 
 
       //** AnagramString **//

	public static boolean CheckString( String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
			str1=str1.toLowerCase();
			str2=str2.toLowerCase();
			
			char[]ch1=str1.toCharArray();
			char[]ch2=str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
		for(int i=0;i<str1.length();i++)
		{
			if(ch1[i]!=ch2[i])
			
				return false;	
			}
			return true;
			
		}
	

	   
 

  //**InsertionSort**//


public static String[] InsertionSort(String[] array)
{
	String key;
	int i,j;
	for(i=1;i<array.length;i++)
	{
		key=array[i];
		j=i-1;
		while(j>=0&&array[j].compareTo(key)>0)
		{
			array[j+1]=array[j];
			j=j-1;
		
		}
		array[j+1]=key;
	
	 } return array;
	 
}

public static void PrintArray(String[] array)

{
  for(int i=0;i<array.length;i++)
  {
	  System.out.println(array[i]);
  }
  System.out.println();
}

public static int[] BubbleSort(int[] array)
{
	int i,j,temp=0;
	for(i=0;i<array.length;i++)
	{
		for(j=0;j<(array.length-1-i);j++)
		{
			if(array[j]>array[j+1])
			{
		      temp=array[j];
		      array[j]=array[j+1];
		      array[j+1]=temp;
			}
	
		}

	}
	return array;
	
}

public static void PrintArray(int[] array)

{
  for(int i=0;i<array.length;i++)
  {
	  System.out.println(array[i]);
  }
  System.out.println();
 

}
    


     //**MagicNumber**//

public static int FindMagicNo(int low,int high)
{    
	String userresponce;
	Scanner s=new Scanner(System.in);
	
	int mid=low+high/2;
	
	if((high-low)==1)
		return low;
	
	System.out.println("is it your number less than "+mid);
	userresponce=s.next();
	
	if(userresponce.equals("true")||userresponce.equals("TRUE"))
	return FindMagicNo(low,mid);
	
	else
		return FindMagicNo(mid,high);
		
	
	
}
}