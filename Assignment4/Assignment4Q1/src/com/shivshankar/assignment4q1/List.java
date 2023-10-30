package com.shivshankar.assignment4q1;

public class List {
	
	public class Node{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	private Node head;
	private Node tail;
	public List(){
		head=null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int value)
	{
		Node newnode=new Node(value);
		if(isEmpty())
			tail=head=newnode;
		else {
			newnode.next=head;
			head=newnode;
			
		}
	}
	
	
	public void addLast(int data)
	{
		Node newnode=new Node(data);
		if(isEmpty())
		{
			tail=head=newnode;
		}
		else {
//			Node trav=head;
//			while(trav.next!=null)
//			{
//				trav=trav.next;
//			}
//			trav.next=newnode;
			tail.next=newnode;
			tail=newnode;
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
			System.out.println("Empty list");
		else
		{
			head=head.next;
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
			System.out.println("List is empty");
		if(head.next==null)
		{
			head=null;
		}
		else {
			Node trav=head;
			
			while(trav.next.next!=null)
				trav=trav.next;
			trav.next=null;
		}
	}
	public void displayList()
	{
		if(isEmpty())
			System.out.println("list is empty");
		else 
		{
			Node trav=head;
			while(trav!=null)
			{
				System.out.println(" "+trav.data);
				trav = trav.next;
			}
				
		}
	}
	
	
	
}
