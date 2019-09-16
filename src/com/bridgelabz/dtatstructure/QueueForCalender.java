package com.bridgelabz.dtatstructure;

public class QueueForCalender 
{
   static  NodeOfQueue front=null;
   static NodeOfQueue rear=null;
   static int count=0;
 // inserting day and date in queue using linklist
   
 /**
 * @param front
 * @param day
 * @param date
 * @return
 */

public static NodeOfQueue insert(NodeOfQueue front, int day,int date) 
 {
	 NodeOfQueue temp= new NodeOfQueue();
	 temp.day=day;
	 temp.date=date;
 
	 if(front==null)
	 {
		 front=temp;
		 rear=temp;System.out.println("no month start"+front.day +front.date);
		 count++;
	 }
	 else 
	 {
		NodeOfQueue node=rear;
		while(node.next!=null)
		{
			node=node.next;
			
		} 
		count++;
		node.next=temp;
		rear=temp;
		
		System.out.println(+rear.day +rear.date);
		int tempDay=rear.day;
		switch(tempDay)
		{
		case 1: System.out.println("Sun"+rear.date+" ");
		       break;
		
		case 2: System.out.println("Mon"+rear.date+" ");
	       break;
		
		case 3: System.out.println("Tue"+rear.date+ " ");
	       break;
	       
		case 4: System.out.println("Wed"+rear.date+ " ");
	       break;
	       
		case 5: System.out.println("The"+rear.date+ " ");
	       break;
	       
		case 6: System.out.println("Fri"+rear.date+ " ");
	       break;
	       
		case 7: System.out.println("Sat"+rear.date);
	       break;
		}
		if(count%7==0) {
			System.out.println();
			
		}
		
	 }
	 return front;
 } 
	 //deleting element in queue
	 public static int  deleteQueue() 
	 {
		 int date=front.date;
		 System.out.println(date);
		 front=front.next;
		 
		 return date;
	 }
	 
   //method for shoing queue
 
	 public static void show() 
	 {
		 NodeOfQueue temp=front;
		 while(temp!=null) 
		 {
			 System.out.println(temp.date+" ");
			 temp=temp.next;
		 }
	 }
}
