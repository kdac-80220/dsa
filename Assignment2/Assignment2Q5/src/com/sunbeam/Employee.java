package com.sunbeam;

public class Employee {
	int empid;
	double sal;
	String name;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int empid, double sal, String name) {
		this.empid = empid;
		this.sal = sal;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", sal=" + sal + ", name=" + name + "]";
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
}
