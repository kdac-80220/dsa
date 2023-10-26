package com.shivshankar.assignment1q1;

import java.util.Scanner;

public class ComparisionLinearBinarySearch {

	public static int LinearSearch(int arr[],int key)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count++;
			if(arr[i]==key)
			{
				System.out.println("Number of times loop executed in linearSearch: "+count);
				return i;
			}
		}
		return -1;
	}
	
	public static int BinarySearch(int arr[],int key)
	{
		int start=0;
		int end=arr.length-1;
		int mid;
		int count=0;
		while(start<=end)
		{
			count++;
			mid=(start+end)/2;
			if(arr[mid]==key)
			{
				System.out.println("Number of times loop executed in binarySearch: "+count);
				return mid;
			}
			if(arr[mid]>key)
			{
				end=mid-1;
			}
			if(arr[mid]<key)
			{
				start=mid+1;
			}
		}
	
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {11,22,33,66,77,88,99,101,105,109};
		System.out.println("Enter value to search");
		int value=sc.nextInt();
		int index1=LinearSearch(arr, value);
		
		if(index1!=-1)
			System.out.println("Element found in linear seacrch at index "+index1);
		else 
			System.out.println("Elemnet not found");
		
		
		
		int index2=BinarySearch(arr, value);

		if(index2!=-1)
			System.out.println("Element found in binary seacrch at index "+index1);
		else 
			System.out.println("Elemnet not found");
	}

}
