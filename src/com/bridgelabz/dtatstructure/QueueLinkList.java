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
  int rear;
  int front;
  
  public void enQueue(T data) 
  {
	  list.addElement(data);
	  rear++;
  }
  
  public boolean isEmpty()
  {
	   return list.isEmpty();
	  
  }
  
  
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
    
  
  public void showQueue() 
	{
		list.ShowList();
	}
  
}
