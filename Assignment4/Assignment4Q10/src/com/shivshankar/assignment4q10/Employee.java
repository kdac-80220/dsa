package com.shivshankar.assignment4q10;

import java.util.Scanner;

public class Employee {
	int empid;
	String name;
	double salary;
	Scanner sc=new Scanner(System.in);
	public void acceptEmployee()
	{
		
		System.out.println("Enter Empid: ");
		this.empid=sc.nextInt();
		System.out.println("Enter Name: ");
		this.name=sc.next();
		System.out.println("Enter Salary: ");
		this.salary=sc.nextDouble();
	}
	
	public void updateEmployee()
	{
		System.out.println("Enter Name: ");
		this.name=sc.next();
		System.out.println("Enter Salary");
		this.salary=sc.nextDouble();
	}
	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
