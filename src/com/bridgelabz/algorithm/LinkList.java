package com.bridgelabz.algorithm;

public class LinkList
{
   public static Node head;
	  
	  public static void Insert(int d) 
	  {    
		  Node node= new Node();
		  node.data=d;
		  node.next=null;
		  
		  if(head==null) 
		  {
			  head=node;
		  }  
		  else
		  {
			  Node n=head;
			  while(n.next!=null) 
			  {
				  n=n.next;
			  }
			  n.next=node;
		  }
		   
	  }  
	  public static void InsertAtStart(int d) 
	  {
		  Node node=new Node();
		  node.data=d;
		  node.next=null;
		  node.next=head;
		  head=node;
	  }
	   public static void InsertAt(int index,int d)  
	   {
		   Node node= new Node();
		   node.data=d;
		   node.next=null;
		   Node n=head;
		   for(int i=0;i<index-1;i++)
           {
			   n=n.next;
		   }
		   node.next=n.next;
		   n.next=node;
		   
	   } 
	   
	   public static void DeleteAt(int index)
	   {
		   
		   if(index==0) 
		   {
			   head=head.next;
		   }
		   else 
		   {   Node n,n1; 
		       n= head;
			   for(int i=0;i<index-1;i++) 
			   {
				    n=n.next;
				}
			   n1=n.next;
			   n.next=n1.next;
			  
		   }
	   }
		  public void ShowList() 
		  {
			  Node node=head;
			  while(node.next!=null) 
			  {
				  System.out.print(node.data+ "-> ");
				  node=node.next;
			  }
			  System.out.print(node.data);
		  }
		
		
	/*	public  void reverseLinkList()
		{  
			if(head==null)
			{
				System.out.println("list is empty");
			}
			Node previous=null;
			Node next=null;
			Node current=head;
			
			while(current!=null) 
			{
				next=current.next;
				current.next=previous;
				previous=current;
				current=next;
				
			}
			
		}*/ 
		 
		 
		}
		  
		  
		  
	  
	

