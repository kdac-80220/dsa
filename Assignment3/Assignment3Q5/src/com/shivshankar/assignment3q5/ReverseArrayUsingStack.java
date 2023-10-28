package com.shivshankar.assignment3q5;

import java.util.Arrays;
import java.util.Scanner;

class Stack{
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

public class ReverseArrayUsingStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element at i: "+i);
			arr[i]=sc.nextInt();
		}
		Stack st=new Stack(4);
		int choice=0;
		do {
			System.out.println("0.Exit");
			System.out.println("1.Regulaar Array");
			System.out.println("2.Reversed Array");
			System.out.print("Enter choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1: System.out.println("Original Array:");
						System.out.println(Arrays.toString(arr));
						for(int i=0;i<arr.length;i++)
						{
							st.push(arr[i]);
						}
						break;
				case 2: System.out.println("Reversed Array");
						int rev[]=new int[4];
							for(int i=0;i<arr.length;i++)
							{
								rev[i]=st.pop();
							}
							System.out.println(Arrays.toString(rev));
						break;
				default: System.out.println("Wrong choice");
					break;
			}
		}while(choice!=0);
	}

}
