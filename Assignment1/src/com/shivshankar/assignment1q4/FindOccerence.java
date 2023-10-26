package com.shivshankar.assignment1q4;

import java.util.Scanner;

public class FindOccerence {
	public static int findOccerenceOfKey(int arr[],int n,int val)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
				count++;
			if(count==n)
				return i;
		}
		
		if(count>0)
			return -99;
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {12,15,12,13,16,15,12,12,12};
		System.out.println("Enter value");
		int val=sc.nextInt();
		System.out.println("Enter which occerence you want to check");
		int n=sc.nextInt();
		int result=findOccerenceOfKey(arr, n, val);
		if(result!=-1 && result !=-99)
			System.out.println(n+" th occerence of value "+val+" at index: "+result);
		if(result ==-99)
			System.out.println(n+" th occerence of value "+val+" not present");
		if(result ==-1)
			System.out.println("Value not exist");
	}

}
