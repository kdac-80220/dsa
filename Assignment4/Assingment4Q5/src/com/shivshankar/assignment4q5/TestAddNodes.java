package com.shivshankar.assignment4q5;

public class TestAddNodes {

	public static void main(String[] args) {

		List l1 = new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.displayList();
		
		l1.addNodeAfterGivenNode(66, 30);
		l1.displayList();
		
		l1.addNodeAfterGivenNode(78, 30);
		l1.displayList(); 
		
		l1.addNodeBeforeGivenNode(99, 78);
		l1.displayList();
		
		l1.addNodeBeforeGivenNode(100, 40);
		l1.displayList();
		
		l1.addNodeBeforeGivenNode(29, 30);
		l1.displayList();
		
		l1.addNodeBeforeGivenNode(50, 10);
		l1.displayList();
	}
	

}

