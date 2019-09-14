package com.bridgelabz.dtatstructure;

public class QueueOp 
{
public static void main(String[] args) {
	System.out.println("show queue");
	Queue q=new Queue();
	q.enQueue(10);
	q.enQueue(20);
	q.enQueue(30);
	q.show();
	
	q.deQueue();
	q.show();
}
}
