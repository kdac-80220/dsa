package com.shivshankar.assignment4q2;

public class LinearCircularLinkedList {
	public static void main(String[] args) {
		List lt=new List();
		lt.addFirst(15);
		//lt.addFirst(25);
		lt.addFirst(55);
		lt.addFirst(60);
//		lt.deleteFirst();
//		lt.deleteLast();
		lt.addPosition(25, 3);
		lt.displayList();
	}
}
