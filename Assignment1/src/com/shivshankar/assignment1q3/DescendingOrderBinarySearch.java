package com.shivshankar.assignment1q3;

import java.util.Scanner;

public class DescendingOrderBinarySearch {
	public static int descendingOrder(int arr[],int key)
	{
		int start=0;
		int end=arr.length-1;
		int mid;
		while(start<=end)
		{
			mid=(start+end)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			if(key<arr[mid])
			{
				start=mid+1;
			}
			if(key>arr[mid])
			{
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int descArr[]= {98,75,65,51,45,35,22,12,6,4};
		System.out.println("Enter key to search");
		int key=sc.nextInt();
		int index=descendingOrder(descArr, key);
		System.out.println("Element found at index "+index);
	}

}
