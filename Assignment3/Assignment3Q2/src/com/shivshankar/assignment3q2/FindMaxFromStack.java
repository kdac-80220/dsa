package com.shivshankar.assignment3q2;

import java.util.Scanner;

class Stack{
	private int arr[];
	private int top;
	private final int SIZE;
	private int max;
	
	public Stack(int size)
	{
		SIZE=size;
		arr=new int[SIZE];
		top=-1;
		max=0;
	}
	
	public void push(int data)
	{
		if(max<data)
			max=data;
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
	
	public int max()
	{
		return max;
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
public class FindMaxFromStack {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack st=new Stack(4);
		int choice=0;
		do {
			System.out.println("0.Exit");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Max");
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
							st.max();
						}
						break;
				case 2: if(st.isEmpty())
						    System.out.println("Stack is empty");
						else
						{
							System.out.println("Popped element"+st.pop());
						}
						break;
				case 3: System.out.println("Peek element: "+st.peek());
						break;
				case 4: System.out.println("Max element: "+st.max());
						break;
				default: System.out.println("Wrong choice");
					break;
			}
		}while(choice!=0);
	}

}
