package com.sunbeam;

import java.util.Scanner;

public class Priority {
	public static int findPriority(String x)
	{
		
		switch(x)
		{
				
			case "+":
			case "-": System.out.println("Priority is 8");
				break;
			
			case "*":
			case "/":System.out.println("Priority is 10");
				break;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char:");
		String a=sc.next();
		findPriority(a);
	}

}
