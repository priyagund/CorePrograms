
/******************************************************************************
*  Purpose: stack using Linklist class to for checking all operation operation 
*
*  @author  Priyanka gund
*  @version 1.0
*  @since   12-09-2019
*
******************************************************************************/package com.bridgelabz.dtatstructure;

public class StackUsinLink<T> {
	LinkedList<T> list = new LinkedList<T>();
	int top = 0;

	public void push(T data) {
		list.addElement(data);
		top++;
	}

	public T pop() {
		
		if (!list.isEmpty()) {
			T data = list.get(top);
			list.delete(--top);
			return data;
		} else {
			System.out.println("Nothing to pop");
			return null;
		}
			
		
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public T peek() {
		T data = list.get(top);
		return data;
	}
	
	public int size()
    {
		int x=0;
		Node<T> node=list.head;
		while(node.next!=null)
		{
			
			x++;
			node=node.next;
		}
		return x;
	}
	
	public void stackshow() 
	{
		Node<T> node=list.head;
		while(node!=null)
		{   
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	
	
}