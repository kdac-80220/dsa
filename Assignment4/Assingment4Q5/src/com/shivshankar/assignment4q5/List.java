package com.shivshankar.assignment4q5;

public class List {
	public class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	
	public List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = newnode;
		else {
			newnode.next = head;
			head = newnode;
		}
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = newnode;
		else {
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			trav.next = newnode;
		}
	}
	
	public void addNodeBeforeGivenNode(int value, int oldvalue) {

		Node newnode = new Node(value);
		Node oldnode = new Node(oldvalue);
		Node trav = head;
		if(isEmpty())
			head = newnode;
		else if ( head.data==oldnode.data)
			addFirst(value);
		else {
			
			while(trav.next.data!=oldnode.data)
				trav = trav.next;
			newnode.next = trav.next;
			trav.next= newnode;
		}
	}
	public void addNodeAfterGivenNode(int value, int oldnodevalue) {

		Node newnode = new Node(value);
		Node oldnode = new Node(oldnodevalue);
		if(isEmpty())
			head = newnode;
		else
		{
			Node trav = head;
			while(oldnode.data!=trav.data)
			{
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}
	
	public void deleteFirst() {
		if(isEmpty())
			System.out.println("List is empty");
		else
			head = head.next;
	}
	
	public void deleteLast() {
		if(isEmpty())
			System.out.println("List is empty");
		else if(head.next == null)
			head = null;
		else {
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			trav.next = null;
		}
	}
	
	public void deletePosition(int pos) {

		if(isEmpty())
			System.out.println("List is empty");
		else if(pos <= 1)
			deleteFirst();
		else if (head.next == null)
			head = null;
		else {

			Node trav = head;
			for(int i = 1 ; i < pos - 1 && trav.next.next != null; i++)
				trav = trav.next;
			trav.next = trav.next.next;
		}
	}

	public void displayList() {

		Node trav = head;
		System.out.print("List :");
		while(trav != null) {
			System.out.print("  " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	
	public void deleteAll() {
		head = null;
	}
	
}