package com.bridgelabz.dtatstructure;

public class MergingTwoLinkedLists {
	
	public static void Merge(LinkedList<Integer> list1,LinkedList<Integer> list2,LinkedList<Integer> end)
	{
		int len1=0,len2=0;
		
		Node<Integer> n1=list1.head;
		Node<Integer> n2=list2.head;
		Node<Integer> n3=end.head;
		
		while(n1.next!=null)
		{
			len1++;
			n1=n1.next;
		}
		while(n2.next!=null)
		{
			len2++;
			n2=n2.next;
		}
		
		while(len1>0 && len2>0)
		{
			n3.data=n1.data;
			n3=n3.next;
			n1=n1.next;
			len1--;
			
			n3.data=n2.data;
			n3=n3.next;
			n2=n2.next;
			len2--;
		}
		
		while(len1>0)
		{
			n3.data=n1.data;
			n3=n3.next;
			n1=n1.next;
			len1--;
		}
		while(len2>0)
		{
			n3.data=n2.data;
			n3=n3.next;
			n2=n2.next;
			len2--;
		}
	}
	
	public static void show(LinkedList<Integer> list)
	{
		Node<Integer> node=list.head;
		while(node!=null)
		{
			System.out.print(node.data);
			node=node.next;
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> list1=new LinkedList<Integer>();
		LinkedList<Integer> list2=new LinkedList<Integer>();
		LinkedList<Integer> end=new LinkedList<Integer>();
		
		for(int i=0;i<4;i++)
		{
			list1.insertAtFirst(i+4);
		}
		show(list1);
		for (int i = 0; i < 5; i++) {
			list2.insertAtFirst(i);
		}
		show(list2);
		
		MergingTwoLinkedLists.Merge(list1, list2, end);
		show(end);
	}

}
