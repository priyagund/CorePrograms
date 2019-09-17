/******************************************************************************
*  Purpose: Queue using Linklist class to enque and deque the operation
*
*  @author  Priyanka gund
*  @version 1.0
*  @since   12-09-2019
*
******************************************************************************/
package com.bridgelabz.dtatstructure;


public class QueueLinkList<T>
{
  LinkedList<T> list=new LinkedList<T>();
  int rear=0;
  int front=0;
  
  
  // insert data in queue
  
  public void enQueue(T data) 
  {
	  list.addElement(data);
	  rear++;
  }
  
  // checking queue position
  
  public boolean isEmpty()
  {
	   return list.isEmpty();
	  
  }
  
  //deleting the data from queue
  
  public T deQueue()
  {
	if (!list.isEmpty()) {
			T data = list.get(front);
			list.delete(front);
			return data;
	}		
  else
	  System.out.println("no element in dequeue");
	return null;
  }
   
  // peek the rear elelment
    public T rearpeek() 
    {
    	T data=list.get(front);
    	return data;
    }
    
    public T frontpeek() 
    {
    	T data=list.get(rear);
    	return data;
    }
    
    // deleting data from first position
     public T deQueueFromStart() 
     {
    	 if (!list.isEmpty()) {
 			T data = list.get(front);
 			list.delete(front);
    	     return data;
    	     
    	 }
    	 else
         {
    		System.out.println("nothing to dequeue in queue"); 
    	 }
    	 return null;
     }
  

     
     // show queue data
	     public void showQueue() 
		{
			list.ShowList();
		}
  
}
