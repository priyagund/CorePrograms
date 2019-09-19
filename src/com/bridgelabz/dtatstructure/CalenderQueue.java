/******************************************************************************
* 
 Purpose:  calender printing using Queue
*
*  @author  Priyanka gund
*  @version 1.0
*  @since   12-09-2019
*
******************************************************************************/
package com.bridgelabz.dtatstructure;

import com.bridgelazs.utility.Utility;

public class CalenderQueue
{
  public static void main(String[] args)
{    LinkedList<Integer> list=new LinkedList<Integer>();
     QueueLinkList<Integer>queue=new QueueLinkList<Integer>();
	  int date=1;
	  int cal[][]=new int[6][7];
      System.out.println("enter month");
      int month=Utility.getInt();
      System.out.println("enter year");
      int year=Utility.getInt();
      
      String months[]= {" ","Jan","Feb",",Mar","Api","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
      int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (Utility.isleap(year))
			days[2] = 29;
		
		int day=Utility.dayOfWeek(1, month, year);
		
		System.out.println(" " +months[month]+" "+ year);
		
		System.out.println("S M T W Th F S ");
		
		//for storing the date in queue
		 int count=1;
		 
		for(int i=0;i<cal.length;i++) 
		{
			
			for(int j=day;j<cal[i].length;j++)
			{
				if(count<=days[month])
				{
					cal[i][j]=count;
					list.addElement(cal[i][j]);
					
					count++;
				}
				else {
					break;
				}
			}
			
			day=0;
		}	
		
//		for(int i=0;i<cal.length;i++) 
//		{
//			
//			for(int j=0;j<cal[i].length;j++)
//			{
//				System.out.print(""+cal[i][j]);
//			}
//			
//			System.out.println();
//		}	
//		
		
		// printing the value of calender
		
		for(int i=0;i<cal.length;i++) 
		{
			for(int j=0;j<cal[i].length;j++) 
			{
				if(cal[i][j]==0)
			{
					System.out.println("  ");
				}
				else if(cal[i][j]<10)
			{
					int day1=queue.deQueue();
					System.out.println("  "+day1+" ");
				}
				
				else
				{
                    int day1=queue.deQueue();
					System.out.println("  "+day1+" ");
				}
				
			}
			System.out.println();
		}
		
}
}
