package com.shivshankar.assignment2q6;

import java.util.Scanner;

class Queue{
	private int arr[];
	private int rear,front;
	private final int SIZE;
	
	public Queue(int size)
	{
		SIZE=size;
		arr=new int[SIZE];
		rear=-1;
		front=-1;
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
	
	public boolean isEmpty()
	{
		if(rear==front && rear==-1)
		return true;
		return false;
	}
	
	public boolean isFull()
	{
		if(rear==SIZE-1)
			return true;
		return false;
	}
	
	public void push(int data)
	{
		rear++;
		arr[rear]=data;
	}
	
	public int pop()
	{
		rear--;
		return arr[rear+1];
	}
	
	public int peekStack()
	{
		return arr[rear];
	}
}
public class QueueAsStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue st=new Queue(4);
		int choice=0;
		do {
			System.out.println("0.Exit");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.print("Enter choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1: if(st.isFull())
						    System.out.println("Stack is full");
						else
						{
							System.out.println("Enter Data: ");
							int data=sc.nextInt();
							st.push(data);
						}
						break;
				case 2: if(st.isEmpty())
						    System.out.println("Stack is empty");
						else
						{
							System.out.println("Popped element"+st.pop());
						}
						break;
				case 3: System.out.println("Peek element Stack: "+st.peekStack());
						System.out.println("Peek element Queue: "+st.peek());
						break;
				default: System.out.println("Wrong choice");
					break;
			}
		}while(choice!=0);
	}

}
