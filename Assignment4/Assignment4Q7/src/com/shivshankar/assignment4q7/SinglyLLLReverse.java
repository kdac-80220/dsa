package com.shivshankar.assignment4q7;

public class SinglyLLLReverse {
	public class Node
	{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			data = value;
			next = null;
		}
	}
	private Node head;
	
	public SinglyLLLReverse()
	{
		head = null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			head = newnode;
		}
		else
		{
			newnode.next = head;
			head = newnode;
		}
	}
	
	public void addLast(int value)
	{
		Node newNode = new Node(value);
		if(isEmpty())
		{
			head = newNode;
		}
		else
		{
			Node trav = head;
			while(trav.next!=null)
			{
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.next = null;
		}
	}
	
	public void addAtPosition(int value,int pos)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head = newnode;
		}
		else if(pos<=1)
		{
			addFirst(value);
		}
		else
		{
			Node trav = head;
			
			for(int i=1;i<pos-1;i++)
			{
				trav = trav.next;
			}
			
			newnode.next = trav.next;
			trav.next = newnode;
			
		}
	}
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty");
			return;
		}
		else
		{
			head = head.next;
		}
		
	}
	
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
			return;
		}
		else if(head.next==null)
		{
			head = null;
		}
		else
		{
			Node trav  = head;
			
			while(trav.next.next!=null)
			{
				trav = trav.next;
			}
			trav.next=null;
			
		}
	}
	
	public void deleteAtPosition(int pos)
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
			return;
		}
		else if(head.next==null)
		{
			head=null;
		}
		else
		{
			Node trav = head;
			for(int i=1;i<pos-1;i++)
			{
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}
	
	public void display()
	{
		Node trav = head;
		
		if(isEmpty())
			System.out.println("List is Empty");
		
		while(trav!=null)
		{
			System.out.print(" "+trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
}