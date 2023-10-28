package com.shivshankar.assignment3q7;

import java.util.Scanner;


class Stack{
	private int arr[];
	private int top;
	private final int SIZE;
	private int poppointer=-1;
	
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
	
	public void pop()
	{
		top--;
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	public int peekQueue()
	{
		return arr[poppointer];
	}
	
	public int popQueue()
	{
		poppointer++;
		return arr[poppointer];
	}
	
	public boolean isEmpty()
	{
			if(top==-1)
				return true;
		return false;
	}
	
	public boolean isFull()
	{
			if(top==SIZE-1)
				return true;
		return false;
	}
	
}




public class StackAsQueue {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Stack st=new Stack(4);
		int choice=0;
		do {
			System.out.println("0.Exit");
			System.out.println("1.Add");
			System.out.println("2.delete");
			System.out.println("3.Peek Queue");
			System.out.print("Enter choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1: if(st.isFull())
						    System.out.println("Queue is full");
						else
						{
							System.out.println("Enter Data: ");
							int data=sc.nextInt();
							st.push(data);
						}
						break;
				case 2: if(st.isEmpty())
						    System.out.println("Queue is empty");
						else
						{
							System.out.println("Popped element"+st.popQueue());
						}
						break;
				case 3: System.out.println("Peek element Queue: "+st.peekQueue());
						System.out.println("Peek element Stack: "+st.peek());
						break;
				default: System.out.println("Wrong choice");
					break;
			}
		}while(choice!=0);
		
		
	}

}
