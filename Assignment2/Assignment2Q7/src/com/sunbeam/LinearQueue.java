package com.sunbeam;

public class LinearQueue {
	
	int arr[];
	int front,rear;
	private final int SIZE;
	
	public LinearQueue(int size) {
		SIZE=size;
		arr=new int[SIZE];
		front=-1;
		rear=-1;
	}
	
	public void insert(int data)
	{
		rear++;
		arr[rear]=data;
	}
	
	public void delete()
	{
		front++;
	}
	
	public int peek()
	{
		return arr[front+1];
	}
	
	public boolean isFull()
	{
		return rear==SIZE-1;
	}
	
	public boolean isEmpty()
	{
		return rear==front;
	}
}
