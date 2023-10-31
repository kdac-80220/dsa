package com.shivshankar.assignment4q8;

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
	
	public List() {
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
			head=newnode;
		else
		{
			newnode.next=head;
			head=newnode;
			
			for(Node i=head;i!=null;i=i.next)
			 {
				 for(Node j=head.next;j.next!=null;j=j.next)
				 {
					 if(j.data>j.next.data)
					 {
						 int temp=j.data;
						 j.data=j.next.data;
						 j.next.data=temp;
					 }
				 }
			 }
		}
	}
	
	public void displayList()
	{
		if(isEmpty())
			System.out.println("List is empty");
		else {
			Node trav=head;
			
			while(trav!=null)
			{
				System.out.println(" "+trav.data);
				trav=trav.next;
			}
				
		}
	}
	
	public void findMiddle()
	{
		if(isEmpty())
			System.out.println("List Empty");
		else {
			Node t1=head;
			Node t2=head;
			
			do {
				t1=t1.next;
				t2=t2.next.next;
			}
			while(t2.next!=null && t2.next.next!=null);
			
			System.out.println("Middle element:"+t1.data);
		}
		
	}
	
	
	
	public void bubbleSortList()
	{
		if(isEmpty())
			System.out.println("Empty List");
		else {
			 for(Node i=head;i!=null;i=i.next)
			 {
				 for(Node j=head.next;j.next!=null;j=j.next)
				 {
					 if(j.data>j.next.data)
					 {
						 int temp=j.data;
						 j.data=j.next.data;
						 j.next.data=temp;
					 }
				 }
			 }
		}
	}
}
