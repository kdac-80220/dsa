package com.shivshankar.assignment1q5;

public class NonRepeatingElement {
	public static int nonRepeating(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
					count++;
			}
			if(count==1)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]={ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int op=nonRepeating(arr);
		if(op!=-1)
		{
			System.out.println("first non repeating value in array at index : "+op);
			System.out.println("Non Repeating value is "+arr[op]);
		}
		else
			System.out.println("No unique values");
	}

}
