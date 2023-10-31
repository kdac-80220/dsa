package com.shivshanakar.assignment5q2;

public class Stack {
	DoublyCircularLinkedList lt;
	public Stack()
	{
		lt=new DoublyCircularLinkedList();
	}
	
	public void push(int data)
	{
		lt.addFirst(data);
	}
	
	public void pop()
	{
		lt.deleteFirst();
	}
	
	public void display()
	{
		lt.displayList();
	}
	
	public void peek()
	{
		System.out.println("Peek element:"+lt.getFirstElement());
	}
}