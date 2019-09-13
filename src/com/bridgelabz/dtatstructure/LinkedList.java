package com.bridgelabz.dtatstructure;

public class LinkedList<T> {
	public Node<T> head;

	public void insertAtFirst(T data) {
		Node<T> node = new Node();
		node.data = data;
		node.next = null;

	}

	public void insertAtLast(T data) {
		Node<T> node = new Node();
		Node temp;
		node.data = data;

		temp = head;
		if (temp == null)
			head = node;
		else {
			while ((temp.next) != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}

	public void addElement(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;

		} else {
			Node<T> newnode = head;

			while (newnode.next != null) {
				newnode = newnode.next;
			}
			newnode.next = node;
		}

	}

	public boolean isEmpty() {
		if (head == null)
			return true;

		return false;
	}

	public void search(T key) {
		boolean isFoundKey = false;
		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			int index=-1;
			Node<T> ptr = head;
			while (ptr != null) {
				index++;
				if ((ptr.data).equals(key)) {
					System.out.println("data is present inlist");
					// return true;
					isFoundKey = true;
					break;
					

				}
				ptr = ptr.next;
			}
//			if ((ptr.data).equals(key)) {
//				isFoundKey = true;
//				index++;
//			}
				
			
			if(isFoundKey) {
				delete(index);
				System.out.println("Deleting..");
			}else {
				insertAtLast(key);
				System.out.println("Inserting..");
			}

		}

	}

	public void delete(int index) {
		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			Node<T> node = head;

			if (index == 0) {
				head = head.next;
			} else {
				Node<T> n = head;
				Node<T> n1;
				for (int i = 0; i < index - 1; i++) {
					n = n.next;
				}
				n1 = n.next;
				n.next = n1.next;
			}
		}
	}

	public void InsertAtposition(int index, T foundword) {
		if (isEmpty())
			System.out.println("list is empty");

		else {
			Node<T> node = new Node();
			node.data = foundword;
			node.next = null;
			Node n = head;

			for (int i = 0; i < index; i++) {
				n = n.next;
			}
			n.next = node.next;
		}

	}

	public int indexOfData(T FindIndex) {
		int count = 0;
		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			Node n = new Node();
			n = head;
			while (n.next != null) {
				n = n.next;
			}
			count++;

		}
		return count++;

	}

	public void ShowList() {
		Node<T> node = head;
		while (node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.print(node.data);
		System.out.println();
	}

	public <T extends Comparable<T>>void sortList() 
	{
		Node<T>node=new Node();
		node=(Node<T>) head;
	    Node<T>n= (Node <T>) head;
	    
	    Node<T>n1=n.next;
	    T temp;
      for(int i=0;i<6-1;i++) 
      {
    	  for(int j=0;j<=(6-1)-1-i;j++) 
    	  {
    		  if((n.data.compareTo(n1.data)>0)) 
    		  {
    			  temp=n.data;
    			  n.data=n1.data;
    			  n1.data=temp;
    		  }
    		  n1=n1.next;
    	  }	
    	  n=n.next;
    	  n1=n.next;
      }
	}	
}	
