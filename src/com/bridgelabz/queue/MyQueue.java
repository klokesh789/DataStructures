package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;

public class MyQueue {
private final MyLinkedList myLinkedList;
	
	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}
	public void enqueue(INode newNode) {
		myLinkedList.append(newNode);
	}
	public void printQueue() {
		myLinkedList.printMyNodes();
	}
	public int dequeue() {
		return myLinkedList.pop();
		
	}

}
