package com.shivshanakar.assignment5q2;

public class DoublyCircularLinkedList {
	public class Node{
		private int data;
		private Node prev;
		private Node next;
		
		public Node(int data) {
			this.data=data;
			prev=null;
			next=null;
		}
	}
	private Node head;

	public DoublyCircularLinkedList()
	{
		head=null;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	public void addFirst(int data)
	{
		Node newnode=new Node(data);
		
		if(isEmpty())
		{
			head=newnode;
			head.next=head;
			head.prev=head;
		}
		else if (head.next==head)
		{
			newnode.next=head.prev;
			newnode.prev=head;
			head.prev=newnode;
			head.next=newnode;
			head=newnode;
			
		}
		else {
			newnode.next=head;
			newnode.prev=head.prev;
			head.prev.next=newnode;
			head.prev=newnode;
			head=newnode;
		}	
	}
	
	public void displayList()
	{
		if(isEmpty())
			System.out.println("List is Empty");
		else {
			Node trav=head;
			do {
				System.out.print(" "+trav.data);
				trav=trav.next;

			}
			while(trav!=head);
			System.out.println();
		}
	}
	
	public void deleteList()
	{
		head=null;
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
			System.out.println("Empty list");
		else {
			head.next.prev=head.prev;
			head=head.next;
		}
		
	}
	
	public void addLast(int data)
	{
		Node newnode=new Node(data);
		if(isEmpty())
			head=newnode;
		else {
			newnode.next=head;
			newnode.prev=head.prev;
			head.prev.next=newnode;
			head.prev=newnode;
		}
	}
	
	public void addPosition(int data,int pos)
	{
		if(isEmpty())
			addFirst(data);
		else {
			Node trav=head;
			for(int i=1;i<pos-1;i++)
			{
				trav=trav.next;
			}
			Node newnode=new Node(data);
			
			newnode.prev=trav;
			newnode.next=trav.next;
			trav.next.prev=newnode;
			trav.next=newnode;
			
		}
			
	}
	
	public void deletePosition(int pos)
	{
		if(isEmpty())
			System.out.println("Empty list");
		else {
			Node trav=head;
			for(int i=1;i<pos-1;i++)
			{
				trav=trav.next;
			}
			trav.next=trav.next.next;
			trav.next.next.prev=trav;
			
		}
		
	}
	
	public void deleteLast()
	{
		Node trav=head;
		
		while(trav.next.next!=head)
			trav=trav.next;
		trav.next=trav.next.next;
		head.prev=trav;
	}
	public int getFirstElement()
	{
		if(isEmpty())
			return 0;
		return head.data; 
	}
	
	public int getPeekForQueue()
	{
		return head.prev.data;
	}
	
}