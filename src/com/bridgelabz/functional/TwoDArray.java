package com.bridgelabz.functional;

import java.io.ObjectInputStream.GetField;

import com.bridgelazs.utility.Utility;

public class TwoDArray
{
  private static final String Do = null;

public static void main(String[] args) 
  {
	  int number=0;
	 
    int[][] intarr=null;
    double[][]doublearr=null;
    boolean[][]booleanarr=null;  
	
    System.out.println("enter row and column");
    int row=Utility.getInt();
    int col=Utility.getInt();
    
    do
       {
    	System.out.println("1. creat 2D array for integer");
    	System.out.println("2. creat 2D array for double");
    	System.out.println("3. creat 2D array for boolean");
    	
    	
    	System.out.println("enter your choice");
    	 int choice =Utility.getInt();
    	 
    	 switch(choice)
    	 {
    	 case 1:
    		 Utility.IntegerArray(row, col);
    	       break;
    	     
    	 case 2:
    	       Utility.DoubleArray(row, col);
    	       break;
    	       
    	 case 3:
    		 Utility.BooleanArray(row,col);
    	       break;
 
    	      
    	default :
    		System.out.println("your choice is wrong");
    		break;
    	 }
    	 
    } while(number==1);
    System.out.println("do you want to continue the enter 1 else 0 "); 
   
  }
}
