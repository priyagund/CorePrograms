/******************************************************************************
* 
 Purpose: Calender printing using stack
*
*  @author  Priyanka gund
*  @version 1.0
*  @since   12-09-2019
*
******************************************************************************/
package com.bridgelabz.dtatstructure;

import com.bridgelazs.utility.Utility;

public class CalenderQueueStack 
{
	public static void main(String[] args)
	{    LinkedList<Integer> list=new LinkedList<Integer>();
	     QueueLinkList<Integer>queue=new QueueLinkList<Integer>();
	     StackUsinLink<Integer>stack1=new StackUsinLink<Integer>();
	     StackUsinLink<Integer>stack2=new StackUsinLink<Integer>();
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
			
			int day=Utility.dayOfWeek(date, month, year);
			System.out.println(" "+months[month]+" "+year);
			
		    System.out.println(" S M T W Th F S");
		    
		    for(int i=0;i<day;i++) 
		    {
		    	System.out.println(" ");
		    }
		    
		    int count=1;
		    
		    for(int i=0;i<cal.length;i++)
		    {
		    	for(int j=0;j<cal[i].length;j++) 
		    	{
		    	   if(count<=days[month])
		    	   {
		    		   cal[i][j]=count;
		    		   
		    		   System.out.print(" "+cal[i][j]);
		    		   
		    		   list.addElement(cal[i][j]);
		    		   count++;
		    		   
		    	   }
		    	   else {
		    		   break;
		    	   }
		    	   
		    	}
		    	day=0;
		    }
		    for(int i=0;i<cal.length;i++) 
		    { //removing element from queue
		    	stack1.push(queue.deQueue());
		    }
		    
		    for(int i=0;i<cal.length;i++)
		    {  
		    	// removing element from stack 1 and adding into stack2
		    	stack2.push(stack1.pop());
		    }
		    
		  // printhing 2D array  
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
		    			int day1=stack2.pop();
		    			System.out.println("  "+day1+" ");
		    		}
		    		
		    		else
		    		{   int day1=stack2.pop();
		    			System.out.println(" "+day1+" ");
		    		}	
		    		
		    	}
		    	System.out.println();
		    }
		    
		    
}

}