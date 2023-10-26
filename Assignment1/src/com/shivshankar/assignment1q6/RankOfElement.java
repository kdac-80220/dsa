package com.shivshankar.assignment1q6;

import java.util.Scanner;

public class RankOfElement {
	public static int findRank(int arr[],int key)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=key)	
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]={ 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter value to count rank: ");
		int key=sc.nextInt();
		int rank=findRank(arr, key);
		System.out.println("Rank of "+key+" is "+rank);
	}

}
