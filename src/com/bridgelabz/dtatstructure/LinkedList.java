package com.bridgelabz.dtatstructure;

public class LinkedList<T> 
{
	public static Node head;
	public  void addElement(T data) 
	{
	 Node<T> node=new Node<T>();
	 node.data1=data;
		node.next=null;
 
	 if(head==null) 
	 {
		 head=node;
		 
	 }
	 else 
	 {   Node<T> newnode=head;
		 
		while(newnode.next!=null)
		{
			newnode=newnode.next;
		}
		newnode.next=node;
	  }
	
	}
	 public  boolean isEmpty() 
	 {
		 if(head==null)
			 return true;
		  
		 return false;
	 }
	 

	public  boolean search(T str1)
	{
		if(isEmpty()) {
			System.out.println("list is empty");
		}
		else
		{
			Node<T> ptr=head;
			while(ptr!=null)
			{
				if((ptr).equals(str1))
				{
					System.out.println("data is present inlist");
					return true;
				}
				ptr=ptr.next;
			}
			
		}
		return false;
	}
	public void delete(int index)
	{
		if(index==0) 
	  {
		  head=head.next;
	  }
	  else
	  {
		  Node<T>n,n1;
		  n=head;
		  for(int i=0;i<index-1;i++)
		  {
			  n=n.next;
			 
		  }
		  n1=n.next;
		  n1.next=n.next;
	  }
			
	}
	public void InsertAtposition(int index, T foundword)
	{
		if(isEmpty()) 
		System.out.println("list is empty");
		
		else
		{
		  Node<T> node=new Node();
		  node.data1=foundword;
		   node.next=null;
		  Node n=head;
		  
		  for(int i=0;i<index;i++) 
		  {
			 n=n.next;
		  }
		  n.next=node.next;
		}
		
	}
	
	public void ShowList()
	{
		Node<T> node=head;
		while(node.next!=null) 
		{
			System.out.println(node.data1 +"");
			node=node.next;
		}
		System.out.println(node.data1);
		System.out.println();
	}
	

}
