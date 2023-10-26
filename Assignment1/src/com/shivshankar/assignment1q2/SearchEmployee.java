package com.shivshankar.assignment1q2;

import java.util.Scanner;

public class SearchEmployee {
	public static int LinearSearchId(Employee e[],int key)
	{
		for(int i=0;i<e.length;i++)
		{
			if(e[i].getEmpid()==key)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int LinearSearchName(Employee e[],String key)
	{
		for(int i=0;i<e.length;i++)
		{
			if(e[i].getName().equals(key))
				return i;
		}
		return -1;
	}

	public static int LinearSearchSalary(Employee e[],Double key)
	{
		for(int i=0;i<e.length;i++)
		{
			if(e[i].salary==key)
				return i;
		}
		return -1;
	}
	
	
	public static int BinarySearchId(Employee e[],int key)
	{
		int start=0;
		int end=e.length-1;
		int mid;
		
		while(start<=end)
		{
			mid=(start+end)/2;
			if(e[mid].empid==key)
			{
				return mid;
			}
			if(e[mid].empid>key)
			{
				end=mid-1;
			}
			if(e[mid].empid<key)
			{
				start=mid+1;
			}
		}
		return -1;
	}
	
	public static int BinarySearchName(Employee e[],String name)
	{
		int start=0;
		int end=e.length-1;
		int mid;
		
		while(start<=end)
		{
			mid=(start+end)/2;
			if(name.equals(e[mid].name))
			{
				return mid;
			}
			int i=name.compareTo(e[mid].name);
			if(i>0)
			{
				end=mid-1;
			}
			if(i<0)
			{
				start=mid+1;
			}
		}
		return -1;
	}
	
	public static int BinarySearchSalary(Employee e[],Double sal)
	{
		int start=0;
		int end=e.length-1;
		int mid;
		
		while(start<=end)
		{
			mid=(start+end)/2;
			if(e[mid].getSalary()==sal)
			{
				return mid;
			}
			if(e[mid].salary>sal)
			{
				end=mid-1;
			}
			if(e[mid].salary<sal)
			{
				start=mid+1;
			}	
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee employee[]=new Employee[5];
		employee[0]=new Employee(1, "Abhishek", 90000.00);
		employee[1]=new Employee(2, "Baban", 45000.00);
		employee[2]=new Employee(3, "Dhairyshil", 55000.00);
		employee[3]=new Employee(4, "Madan", 74000.00);
		employee[4]=new Employee(5, "Vinayakraj", 47000.00);
		
		System.out.println("Enter id for search");
		int id=sc.nextInt();
		int index1=LinearSearchId(employee, id);
		if(index1!=-1)
			System.out.println("Employee found at index "+index1);
		else
			System.out.println("Employee not exist");
		
		System.out.println("Enter name for search");
		String name=sc.next();
		int index2=LinearSearchName(employee, name);
		if(index2!=-1)
			System.out.println("Employee found at index "+index2);
		else
			System.out.println("Employee not exist");
		
		
		System.out.println("Enter Salary to Search");
		Double sal=sc.nextDouble();
		int index3=LinearSearchSalary(employee, sal);
		if(index3!=-1)
			System.out.println("Employee found at index "+index3);
		else
			System.out.println("Employee not exist");
		
		//binary search
		System.out.println("Enter id for Binary Search");
		int bid=sc.nextInt();
		int index4=BinarySearchId(employee,bid);
		if(index4!=-1)
			System.out.println("Element found in binary search at index "+index4);
		else 
			System.out.println("Element not found");
	
		System.out.println("Enter Name for Binary Search");
		String bname=sc.next();
		int index5=BinarySearchId(employee,bid);
		if(index5!=-1)
			System.out.println("Element found in binary search at index "+index5);
		else 
			System.out.println("Element not found");
		
		
		System.out.println("Enter salary");
		Double dsal=sc.nextDouble();
		int index6=BinarySearchSalary(employee, dsal);
		if(index6!=-1)
			System.out.println("Element found in binary search at index "+index6);
		else
			System.out.println("Element not found");
	}

}
