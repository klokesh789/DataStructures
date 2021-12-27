package com.bridgelabz.hashtable;

public class LinkedList {
	Node head;

	public void add(String key , int value) 
	{

		Node newNode = new Node();
		newNode.key = key;
		newNode.value = value;
		newNode.next = head;
		head = newNode;
	}
	
	public Node search(String key)
	{
		Node traverse = head;
		while(traverse != null)
		{
			if(traverse.key.equals(key))
			{
				return traverse;
			}
			traverse = traverse.next;
		}
		return null;
		
	}


}
