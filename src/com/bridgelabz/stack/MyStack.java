package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;

public class MyStack {
private final MyLinkedList myLinkedList;
	
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	public void push(INode newNode) {
		myLinkedList.add(newNode);
	}
	public void printStack() {
		myLinkedList.printMyNodes();
	}

}
