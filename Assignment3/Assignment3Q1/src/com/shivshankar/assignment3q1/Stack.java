package com.shivshankar.assignment3q1;

public class Stack{
	private int arr[];
	private int top;
	private final int SIZE;
	
	public Stack(int size)
	{
		SIZE=size;
		arr=new int[SIZE];
		top=-1;
	}
	
	public void push(int data)
	{
		top++;
		arr[top]=data;
	}
	
	public int pop()
	{
		top--;
		return arr[top+1];
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	}
	public boolean isFull() {
		if(top==SIZE-1)
			return true;
		return false;
	}
}

