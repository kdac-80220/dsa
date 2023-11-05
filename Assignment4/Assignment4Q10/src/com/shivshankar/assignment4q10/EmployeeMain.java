package com.shivshankar.assignment4q10;

public class EmployeeMain {

	public static void main(String[] args) {
		List lt=new List();
		lt.addFirst(new Employee(1,"Shiv",52000.00));
		lt.addFirst(new Employee(2,"Omu",75000.00));
		lt.addFirst(new Employee(3,"Dhairya",42000.00));
		lt.addFirst(new Employee(4,"Vinu",62000.00));
		lt.addFirst(new Employee(5,"Omu",52000.00));
		//lt.searchbyName("Omu");
		//lt.deleteByEmpid(5);
		lt.updateEmployee(10);
		//lt.search(2);
		lt.displayAll();
	}

}
