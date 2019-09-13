package com.bridgelabz.dtatstructure;

import com.bridgelazs.utility.Utility;

public class StackUsinLink<T>
{ 

	public Node<T> head;
	Node<T> node=new Node();
	T top=null;
	public void push(T data)
    {
		Node<T> temp=new Node<T>();
		if(temp==null)
		{
			System.out.println("Heap overflow");
		}
		temp.data=data;
		temp.next=top;
		top=temp;
	}
	 public boolean isEmpty() 
	 {
		return top=null;
		 
	 }
	 public int peek() 
	 {
		 if(!isEmpty()) {
			 return top.data;
			 
		 }
			 
	 }
}