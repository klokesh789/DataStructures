package com.bridgelabz.linkedlist;

public class MyOrderedLinkedList {
	public   INode head;
    public   INode tail;
    static int counter =1;
    INode temp ;
    
    public MyOrderedLinkedList(){
            this.head = null;
            this.tail = null;
        }
    public void add(INode newNode) {

        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
            this.temp = newNode;
        } else {
            INode tempNode = this.head;
            if (counter == 1) {
                if (tempNode.getKey().compareTo(newNode.getKey()) > 0) {
                    newNode.setNext(tempNode);
                    tempNode.setNext(null);
                    this.head = newNode;
                    counter++;
                } else {
                    tail.setNext(newNode);
                    this.tail = newNode;
                    counter++;
                }
            }
            if (counter == 2) {
                tempNode = this.head;
                if (newNode.getKey().compareTo(tempNode.getKey()) > 0 && newNode.getKey().compareTo(tempNode.getNext().getKey()) > 0) {

                    tempNode.getNext().setNext(newNode);
                    //tail.setNext(newNode);
                    newNode.setNext(null);
                    //this.head = tempNode;
                    counter++;
                }
                if (newNode.getKey().compareTo(tempNode.getKey()) > 0 && newNode.getKey().compareTo(tempNode.getNext().getKey()) < 0) {
                    temp = tempNode.getNext();
                    tempNode.setNext(null);
                    tempNode.setNext(newNode);
                    newNode.setNext(temp);
                    counter++;
                }
                if (newNode.getKey().compareTo(tempNode.getKey()) < 0) {
                    newNode.setNext(tempNode);
                    this.head = newNode;
                    counter++;
                }
            }

            if (counter == 3) {
                tempNode = this.head;
                if (tempNode.getKey().compareTo(newNode.getKey()) < 0 && tempNode.getNext().getKey().compareTo(newNode.getKey()) < 0 && tempNode.getNext().getNext().getKey().compareTo(newNode.getKey()) < 0) {
                    tempNode.getNext().getNext().setNext(newNode);
                    this.tail=newNode;
                }
                if (tempNode.getKey().compareTo(newNode.getKey()) > 0 && tempNode.getNext().getKey().compareTo(newNode.getKey()) > 0 && tempNode.getNext().getNext().getKey().compareTo(newNode.getKey()) > 0) {
                    newNode.setNext(tempNode);
                    this.head = newNode;
                }
                if (tempNode.getKey().compareTo(newNode.getKey()) < 0 && tempNode.getNext().getKey().compareTo(newNode.getKey()) > 0 && tempNode.getNext().getNext().getKey().compareTo(newNode.getKey()) > 0) {
                    temp = tempNode.getNext();
                    tempNode.setNext(newNode);
                    newNode.setNext(temp);
                }
                if (tempNode.getKey().compareTo(newNode.getKey()) < 0 && tempNode.getNext().getKey().compareTo(newNode.getKey()) < 0 && tempNode.getNext().getNext().getKey().compareTo(newNode.getKey()) > 0) {
                    temp = tempNode.getNext().getNext();
                    tempNode.getNext().setNext(newNode);
                    newNode.setNext(temp);
                }
            }
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
     public void isEmpty(){
         if(this.head == null){
             System.out.println("Linked list is Empty");
         }
         else{
             System.out.println("Linked list Not Empty");
         }
     }
     public void insert(INode myNode ,INode newNode){
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
        }
     public INode pop(){
        INode tempNode = this.head;
        tempNode = tempNode.getNext();
        tempNode.setNext(null);
        return tail;
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
     public void remove(INode myNode ){
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
