package com.sunbeam;

import java.util.Arrays;

public class EmployeeSort {
	
	public static int EmployeeSortSalary(Employee e[])
	{
		int comparisions=0;
		
		for(int i=1;i<e.length;i++)
		{
			int j=i-1;
			Employee temp=e[i];
			while(j>=0 && e[j].getSal()>temp.getSal())
			{
				comparisions++;
				e[j+1]=e[j];
				j--;
			}
			e[j+1]=temp;
		}
		return comparisions;
	}
	
	
	public static void main(String[] args) {
		Employee employee[]=new Employee[5];
		employee[0]=new Employee(5,25000.0,"Shiv");
		employee[1]=new Employee(4,12000.0,"Omu");
		employee[2]=new Employee(2,17000.0,"Rajesh");
		employee[3]=new Employee(1,45000.0,"Dhairya");
		employee[4]=new Employee(3,2000.0,"Madan");
		int noOfComparisions=EmployeeSortSalary(employee);
		System.out.println(noOfComparisions);
		for(Employee e:employee)
			System.out.println(e);
		}

}