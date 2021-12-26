package com.bridgelabz.linkedlist;

public class MyLinkedList {
	 public   INode head;
	 public   INode tail;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }
    public void add(INode newNode) {
        if(this.tail == null){
         this.tail=newNode;
      }
        if(this.head== null){
          this.head=newNode;
	        }
        else{
	       INode tempNode = this.head;
	       this.head = newNode;
	       this.head.setNext(tempNode);
	        }
    }
    public void append(INode newNode){
	        if(this.head == null){
	            this.head=newNode;
	        }
	        if(this.tail== null){
	            this.tail=newNode;
	        }else{
	            this.tail.setNext(newNode);
	            this.tail=newNode;
	        }
    }
    public void insert(INode myNode ,INode newNode){
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
        }
    public INode popLast(){
        INode tempNode = this.head;
        tempNode = tempNode.getNext();
        tempNode.setNext(null);
        return tail;
        }
    public void search(INode myNode) {
        INode tempNode = this.head;
        while(tempNode != null ) {
            if (myNode.getKey() == tempNode.getKey()) {
                System.out.println("Element found :"+myNode.getKey());
                break;
            }
            tempNode=tempNode.getNext();
        }
    }
    public void insertUsingKey(INode myNode,INode value){
        INode tempNode = this.head;
        while(tempNode != null ) {
            if (myNode.getKey() == tempNode.getKey()) {
                INode temp =tempNode.getNext();
                tempNode.setNext(value);
                tempNode = tempNode.getNext();
                tempNode.setNext(temp);
                break;
            }
            tempNode=tempNode.getNext();
        }
    }
    public void deleteKey(INode myNode ){
        INode tempNode = this.head;
        while(tempNode != null ) {
            if (myNode.getKey() == tempNode.getKey()) {
                INode temp =tempNode.getNext();
                //tempNode= null;
                INode demoNode = this.head;
                demoNode = demoNode.getNext();
                demoNode.setNext(temp);
                break;
            }
            tempNode=tempNode.getNext();
        }
    }
    public void size(){
        int counter = 1;
        INode tempNode = this.head;
        while(tempNode != this.tail) {
            if (tempNode.getNext() == null) {

            } else {
                tempNode = tempNode.getNext();
                counter++;
            }

        }
            System.out.println("Size of current Linked List is: "+counter);
    }
    public  void printMyNodes(){
	        StringBuffer myNodes = new StringBuffer("My Nodes:");
	        INode tempNode = head;
	        while(tempNode.getNext()!= null){
	            myNodes.append(tempNode.getKey());
	            if(!tempNode.equals(tail))
	                myNodes.append("->");
	                tempNode=tempNode.getNext();
	        }
	        myNodes.append(tempNode.getKey());
	        System.out.println(myNodes);

	    }


}
